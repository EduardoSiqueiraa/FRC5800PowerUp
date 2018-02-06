package org.usfirst.frc.team5800.robot;

import static org.usfirst.frc.team5800.robot.RobotMap.*;
import static org.usfirst.frc.team5800.robot.base.commands.CommandBase.*;

import java.io.File;
import java.sql.DriverManager;

import org.usfirst.frc.team5800.robot.base.buttons.*;
import org.usfirst.frc.team5800.robot.base.commands.*;
import org.usfirst.frc.team5800.robot.base.commands.autonomous.Autonomous;
import org.usfirst.frc.team5800.robot.base.commands.drive.CommandGoForward;
import org.usfirst.frc.team5800.robot.base.commands.drive.CommandTurnDegrees;
import org.usfirst.frc.team5800.robot.base.subsystems.SubsystemJoystick;
import org.usfirst.frc.team5800.robot.commands.teleoperated.*;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.communication.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

@SuppressWarnings("unused")

public class OI {
	public OI() {
		Autonomous.initAutonomous();
		
//		joystick.whenHeld(SubsystemJoystick.d_A, new CommandGoForward());
//		joystick.whenPressed(SubsystemJoystick.d_B, new CommandTurnDegrees(90, 0.5));
		
		joystick.whenHeld(SubsystemJoystick.d_A, new CommandArmIntake());
		joystick.whenHeld(SubsystemJoystick.d_Y, new CommandArmOuttake());
		
		joystick.whenPressed(SubsystemJoystick.d_LT, new CommandArmOpen());
		joystick.whenPressed(SubsystemJoystick.d_RT, new CommandArmClose());
	}
}
