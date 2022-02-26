package state;

import command.*;

public class DriveState implements State{
	TrainSystem trainSystem;
	TrainManager trainManager;
	
	public DriveState(TrainSystem trainSystem, TrainManager trainManager) {
		// TODO Auto-generated constructor stub
		this.trainSystem = trainSystem;
		this.trainManager = trainManager;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Train is moving");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Train is braking");
		Train train = new Train();
		Command trainBrakeCommand = new TrainBrake(train);
		trainManager.setCommand(trainBrakeCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getBrakeState());
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Brake the train first");

	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Train already turned on");
	}

}
