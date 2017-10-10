package org.usfirst.frc.team1786.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1786.robot.Robot;

public class DriveWithPrecision extends Command{

    public DriveWithPrecision() {
        requires(Robot.drivetrain);
    }

    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivetrain.drive(0.5 * Robot.oi.getJoystick().getX(), 0.5 * Robot.oi.getJoystick().getY(), 0.5 * Robot.oi.getJoystick().getTwist(), 0);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }

    // might break things?
    @Override
    protected void end() {
    }

    protected void interrupted() {
    }
}

