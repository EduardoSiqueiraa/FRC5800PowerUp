package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandGoForward extends Command5800 {
	public CommandGoForward() {
		super(driver);
	}

	protected void execute() {
		driver.motorRight1.set(-0.4);
		driver.motorRight2.set(-0.4);
		driver.motorLeft1.set(0.4);
		driver.motorLeft2.set(0.4);
	}
	
	protected boolean isDone() {
		return false;
	}

	protected void onCompletion() {
		driver.motorRight1.set(0);
		driver.motorRight2.set(0);
		driver.motorLeft1.set(0);
		driver.motorLeft2.set(0);		
	}
}
