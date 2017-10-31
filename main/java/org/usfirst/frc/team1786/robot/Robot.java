package org.usfirst.frc.team1786.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team1786.robot.subsystems.DriveTrain;

/*
 * This class is automagically run by the roborio
 */
public class Robot extends IterativeRobot {
    public static DriveTrain drivetrain;
    public static OI oi;

    /*
     * Run on robot setup
     */
    @Override
    public void robotInit() {

    }

    /*
     * A place for any autonomous mode setup
     */
    @Override
    public void autonomousInit() {

    }

    /*
     * A place to call autonomous commands
     */
    @Override
    public void autonomousPeriodic() {

    }

    /*
     * A place for any teleoperated setup
     */
    @Override
    public void teleopInit() {

    }

    /*
     * A place for teloperated calls
     * In this case, run the scheduler so that default commands (e.g. mecanum driving) can occur
     *
     * The Schedules works like this:
     * 1. poll all buttons and triggers
     * 2. run each scheduled command
     * 3. add recently scheduled commands
     * 4. default commands are added
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}
