package org.usfirst.frc.team1764.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import static org.usfirst.frc.team1764.robot.Robot.*;

/**
 *
 */
public class RunBoxIntake extends Command {
	private double speed = 0;
	
    public RunBoxIntake(double speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(boxIntake);
    	this.speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
  
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boxIntake.set(this.speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	boxIntake.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	boxIntake.set(0);
    }
}