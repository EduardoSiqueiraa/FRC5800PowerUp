package org.usfirst.frc.team5800.robot.commands.teleoperated;
import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandArmOuttake extends Command5800
{	
	public CommandArmOuttake() {
		super(arm);
	}
	
	protected void onStart() {
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		arm.outtake();
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return false;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {
		arm.stop();
	}
}
