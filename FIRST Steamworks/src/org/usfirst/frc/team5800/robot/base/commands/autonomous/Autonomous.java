package org.usfirst.frc.team5800.robot.base.commands.autonomous;

import org.usfirst.frc.team5800.robot.base.commands.drive.CommandTurnDegrees;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class Autonomous extends Command5800
{
	public Autonomous() {super(null);}
	protected void execute() {}
	protected boolean isDone() {return true;}
	protected void onCompletion() {}
	
	public static Autonomous[] autonomous = new Autonomous[2];
	
	public static void initAutonomous() {
		//Setar o sequencial que cada versao de autonomo ira rodar
		
		//Fazer nada
		autonomous[0] = new Autonomous();
		
		autonomous[1] = (Autonomous) new Autonomous().setSequential(
                //new CommandEncoderMove(1726, 0.5),
                new CommandTurnDegrees(60, 0.4),
                new CommandTurnDegrees(-60, 0.4)
                //new CommandEncoderMove(347, 0.5)
        );
	}
}
