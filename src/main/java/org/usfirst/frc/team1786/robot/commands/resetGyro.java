package org.usfirst.frc.team1786.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1786.robot.Robot;

public class resetGyro extends Command {

    public resetGyro() {
        requires(Robot.drivetrain);
    }

    public void initialize() {

    }

    @Override
    protected void execute() {
        Robot.drivetrain.resetDrivingAngle();
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
    
    @Override
    protected void end() {
    }

    protected void interrupted() {
    }
}
