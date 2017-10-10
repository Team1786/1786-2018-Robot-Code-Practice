package org.usfirst.frc.team1786.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1786.robot.Robot;

public class DriveWithFieldOrientation extends Command {

    public DriveWithFieldOrientation() {
        requires(Robot.drivetrain);
    }

    public void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivetrain.FieldOrientedDriving(Robot.oi.getJoystick());
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
