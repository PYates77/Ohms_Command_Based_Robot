package edu.wpi.first.wpilibj.templates.commands;

public class TurnOnGun extends CommandBase {
    private final static boolean ON = true;
    private final static boolean OFF = false;
    
    public TurnOnGun() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        shooter.gun(ON);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
        shooter.gun(ON);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        shooter.gun(ON);
    }
}