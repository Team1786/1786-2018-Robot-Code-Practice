package org.usfirst.frc.team1786.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1786.robot.Robot;

public class DriveWithJoystick extends Command {

    // Constructor, we need the subsystem in order to perform commands with it
    public DriveWithJoystick() {
        requires(Robot.drivetrain);
    }

    // Because we're extending command, we need this function to get started
    protected void initialize() {

    }

    /*
     * This program is the main area of execution, it will be called repeatedly when the command is run
     */
    @Override
    protected void execute() {
        Robot.drivetrain.drive(Robot.oi.getJoystick());
    }

    /*
     * this function will return true when done running execute()
     */
    @Override
    protected boolean isFinished() {
        return false;
    }

    // this is called after isFinished return true
    // stop everything
    @Override
    protected void end() {
        Robot.drivetrain.drive(0,0,0, 0);
    }

    // Handle interuptions
    protected void interrupted() {
    }
}
