package org.usfirst.frc.team1786.robot;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team1786.robot.commands.DriveWithFieldOrientation;
import org.usfirst.frc.team1786.robot.commands.DriveWithPrecision;
import org.usfirst.frc.team1786.robot.commands.resetGyro;

/*
 * The purpose of this class is to provide all hardware connections and controls to commands and subsystems
 */
public class OI {
    // this is where we instantiate the actual hardware connected joystick
    private Joystick joy = new Joystick(0);


    public OI() {
        //Buttons can be bound here
        JoystickButton upper1 = new JoystickButton(joy, 1);
        JoystickButton upper2 = new JoystickButton(joy, 2);
        JoystickButton upper3 = new JoystickButton(joy, 3);
        JoystickButton upper4 = new JoystickButton(joy, 4);
        JoystickButton trigger = new JoystickButton(joy, 5);
        JoystickButton thumb = new JoystickButton(joy, 6);
        JoystickButton lower7 = new JoystickButton(joy, 7);
        JoystickButton lower8 = new JoystickButton(joy, 8);
        JoystickButton lower9 = new JoystickButton(joy, 9);
        JoystickButton lower10 = new JoystickButton(joy, 10);
        JoystickButton lower11 = new JoystickButton(joy, 11);
        JoystickButton lower12 = new JoystickButton(joy, 12);

        // bind buttons to commands (these need to be commands in actual classes
        lower11.toggleWhenPressed(new DriveWithPrecision());
        //will untoggling it go to default?
        lower10.toggleWhenPressed(new DriveWithFieldOrientation());
        lower9.whenPressed(new resetGyro());
    }

    public Joystick getJoystick() {
        return joy;
    }
}
