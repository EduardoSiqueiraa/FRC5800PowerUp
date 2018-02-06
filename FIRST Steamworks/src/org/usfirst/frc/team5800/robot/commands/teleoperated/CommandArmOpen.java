package org.usfirst.frc.team5800.robot.commands.teleoperated;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandArmOpen extends Command5800
{	
	public CommandArmOpen() {
		super(arm);
	}
	
	protected void onStart() {}

	protected void execute() {}
	
	protected boolean isDone() {
		return true;
	}

	protected void onCompletion() {
		arm.open();
	}
}
