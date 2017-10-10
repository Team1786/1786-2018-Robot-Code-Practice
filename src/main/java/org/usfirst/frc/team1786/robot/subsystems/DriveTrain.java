package org.usfirst.frc.team1786.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import com.ctre.CANTalon;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SPI;

import org.usfirst.frc.team1786.robot.commands.DriveWithJoystick;

/*
 * Create a new subsystem to manage the drive train
 */
public class DriveTrain extends Subsystem {
    // instantiate the motor controllers, in this case CANTalons, which is what we usually use.
    private SpeedController frontLeftMotor = new CANTalon(1);
    private SpeedController rearLeftMotor = new CANTalon(2);
    private SpeedController frontRightMotor = new CANTalon(3);
    private SpeedController rearRightMotor = new CANTalon(4);

    // instantiate a robotDrive object
    private RobotDrive drive = new RobotDrive(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);

    // instantiate the gyroscope
    private AHRS ahrs = new AHRS(SPI.Port.kMXP);

    public DriveTrain() {
        //call Subsystem's constructor, do it.
        super();
    }

    /*
     * Function exists in Subsystem class, but we need to add our own custom command!
     * This is where "default commands live, e.g regular mecanum driving with a
     * joystick. You need a default command function override to do this.
     */
    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new DriveWithJoystick());
    }

    /*
     * Mecanum style driving functionality with any raw inputs
     *
     *
     */
    public void drive(double x, double y, double z, double gyro) {
        drive.mecanumDrive_Cartesian(x, y, z, gyro);
    }

    /*
     * Mecanum style driving with a joystick!
     */
    public void drive(Joystick joy) {
        drive.mecanumDrive_Cartesian(-joy.getY(), -joy.getX(), -joy.getTwist(),0);
    }

    /*
     * Field Oriented Driving
     */
    public void FieldOrientedDriving(Joystick joy) {
        drive.mecanumDrive_Cartesian(-joy.getY(), -joy.getX(), -joy.getTwist(), ahrs.getAngle());
    }

    // reset reference point
    public void resetDrivingAngle() {
        ahrs.reset();
    }
}
