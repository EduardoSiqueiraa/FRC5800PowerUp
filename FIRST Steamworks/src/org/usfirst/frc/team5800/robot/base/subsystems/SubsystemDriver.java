package org.usfirst.frc.team5800.robot.base.subsystems;

import static org.usfirst.frc.team5800.robot.RobotMap.*;

import org.usfirst.frc.team5800.robot.superclasses.Subsystem5800;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemDriver extends Subsystem5800
{
	//Set up motors and solenoids here. Make sure to use the RobotMap.
	public VictorSP motorLeft2 = new VictorSP(driveMotorL2ID);
	public VictorSP motorLeft1 = new VictorSP(driveMotorL1ID);
	
	public VictorSP motorRight2 = new VictorSP(driveMotorR2ID);
	public VictorSP motorRight1 = new VictorSP(driveMotorR1ID);
	
	public VictorSP testMotor = new VictorSP(testMotorID);

	private RobotDrive driveFront = new RobotDrive(motorLeft1, motorRight1);
	private RobotDrive driveRear = new RobotDrive(motorLeft2, motorRight2);
	
	public SubsystemDriver() {
		super();
	}

	public void onInit() {
		//Perform anything that needs to be done before the subsystem is used here. 
		//Do not start sensors. Do that in SubsystemSensors.initSensors().
	}
	
	public void tankDrive(double left, double right) {
		driveFront.tankDrive(left, right);
		driveRear.tankDrive(left, right);
	}

	public void arcadeDrive(double speed, double d) {
		driveFront.arcadeDrive(speed, d);
		driveRear.arcadeDrive(speed, d);
	}
}
