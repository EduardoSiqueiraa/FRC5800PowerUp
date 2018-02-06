package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.*;

public class SubsystemArm extends Subsystem5800
{
	public VictorSP armMotorLeft1 = new VictorSP (armMotorL1ID);
	public VictorSP armMotorRight1 = new VictorSP (armMotorR1ID);
	
	public Solenoid armSolenoid1 = new Solenoid (armActuator1ID);
	public Solenoid armSolenoid2 = new Solenoid (armActuator2ID);
	
	public void intake() {
		armMotorLeft1.set(0.5);
		armMotorRight1.set(-0.5);
	}
	
	public void outtake() {
		armMotorLeft1.set(-0.5);
		armMotorRight1.set(0.5);
	}
	
	public void stop() {
		armMotorLeft1.set(0);
		armMotorRight1.set(0);	
	}
	
	public void open() {
		armSolenoid1.set(false);
		armSolenoid2.set(false);
	}
	
	public void close() {
		armSolenoid1.set(true);
		armSolenoid2.set(true);		
	}
	
	public void boxDrop() {
		armSolenoid1.set(true);
		armMotorLeft1.set(0.0);
		armMotorRight1.set(0.0);
	}
	
//	public void boxFixLeft() {
//		armMotorLeft1.set(0.8);
//		armMotorRight1.set(-0.5);
//		armSolenoid1.set(false);
//	}
//	
//	public void boxFixRight() {
//		armMotorLeft1.set(0.5);
//		armMotorRight1.set(-0.8);
//		armSolenoid1.set(false);
//	}
}