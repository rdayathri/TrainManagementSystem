package state;

import command.*;

public class BrakeState implements State {
	TrainSystem trainSystem;
	TrainManager trainManager;
	public BrakeState(TrainSystem trainSystem, TrainManager trainManager) {
		// TODO Auto-generated constructor stub
		this.trainSystem = trainSystem;
		this.trainManager = trainManager;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Train moving again");
		Train train = new Train();
		Command trainDriveCommand = new TrainDrive(train);
		trainManager.setCommand(trainDriveCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getDriveState());
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Train has already stopped");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning train off");
		Train train = new Train();
		Command trainTurnOffCommand = new TrainTurnOff(train);
		trainManager.setCommand(trainTurnOffCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getOffState());
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Train already on");
	}

}
