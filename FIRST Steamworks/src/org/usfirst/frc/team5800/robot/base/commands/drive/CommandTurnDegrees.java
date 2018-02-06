package org.usfirst.frc.team5800.robot.base.commands.drive;

import org.usfirst.frc.team5800.robot.superclasses.Command5800;

public class CommandTurnDegrees extends Command5800 {
	
	int degreesToTurn;
	
	double speed;
	double leftValue;
	double rightValue;
	
	int turnDirection; //1 for left, 0 for right
	
	boolean done = false;
	
	public CommandTurnDegrees(int degrees, double speed) {
		super(driver);
		this.speed = speed;
		this.degreesToTurn = degrees;
	}
	
	//Setar as acoes que serao realizadas quando o comando for iniciado
	protected void onStart() {
		sensors.gyro.reset();
		if(this.degreesToTurn < 0) {
			this.turnDirection = 1;
			this.leftValue = -this.speed;
			this.rightValue = this.speed;
		}else if(this.degreesToTurn > 0) {
			this.turnDirection = 0;
			this.leftValue = this.speed;
			this.rightValue = -this.speed;
		}
	}

	//Setar as acoes que serao realizadas de forma paralela enquanto o comando e executado
	protected void execute() {
		if(this.turnDirection == 1) {
            if(sensors.gyro.getAngle() > (this.degreesToTurn * 0.97)) {
	                driver.tankDrive(this.leftValue, this.rightValue);
            }else if(sensors.gyro.getAngle() < (this.degreesToTurn * 1.03)) {
                driver.tankDrive(-this.leftValue, -this.rightValue);
            }else {
                try {
                    Thread.sleep(300);
                }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(sensors.gyro.getAngle() < (this.degreesToTurn * 0.97) & sensors.gyro.getAngle() > (this.degreesToTurn * 1.03)) {
                    this.done = true;
                }else {
                	this.speed -= 0.05;
        			this.leftValue = -this.speed;
        			this.rightValue = this.speed;
                }
            }
        }else if(this.turnDirection == 0) {
            if(sensors.gyro.getAngle() < (this.degreesToTurn * 0.98)) {
                driver.tankDrive(this.leftValue, this.rightValue);
            }else if(sensors.gyro.getAngle() > (this.degreesToTurn * 1.02)) {
                driver.tankDrive(-this.leftValue, -this.rightValue);
            }else {
                try {
                    Thread.sleep(300);
                }catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                if(sensors.gyro.getAngle() > (this.degreesToTurn * 0.98) & sensors.gyro.getAngle() < (this.degreesToTurn * 1.02)) {
                    this.done = true;
                }else {
                    this.speed -= 0.05;
        			this.leftValue = this.speed;
        			this.rightValue = -this.speed;
                }
            }
        }
	}
	
	//Setar as condicoes para terminar a execucao do comando
	protected boolean isDone() {
		return this.done;
	}

	//Setar as acoes que serao realizadas quando a condicao isDone for satisfeita
	protected void onCompletion() {}
}
