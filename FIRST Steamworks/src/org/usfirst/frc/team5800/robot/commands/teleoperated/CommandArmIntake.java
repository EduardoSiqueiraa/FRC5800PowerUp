package org.usfirst.frc.team5800.robot.commands.teleoperated;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandArmIntake extends Command5800
{	
	public CommandArmIntake() {
		super(arm);
	}
	
	protected void onStart() {
	}

	protected void execute() {
		arm.intake();
	}
	
	protected boolean isDone() {
		return false;
	}

	protected void onCompletion() {
		arm.stop();
	}
}
