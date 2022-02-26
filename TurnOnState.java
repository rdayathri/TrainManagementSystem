package state;

import command.Command;
import command.Train;
import command.TrainManager;
import command.TrainTurnOn;
import command.TrainTurnOff;
import command.TrainDrive;

public class TurnOnState implements State {
	TrainSystem trainSystem;
	TrainManager trainManager;
	public TurnOnState(TrainSystem trainSystem, TrainManager trainManager) {
		// TODO Auto-generated constructor stub
		this.trainSystem = trainSystem;
		this.trainManager = trainManager;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Train is moving");
		Train train = new Train();
		Command traindriveCommand = new TrainDrive(train);
		trainManager.setCommand(traindriveCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getDriveState());
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Train is not moving yet");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Turning train offline");
		Train train = new Train();
		Command trainTurnOnCommand = new TrainTurnOff(train);
		trainManager.setCommand(trainTurnOnCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getOffState());
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Train already turned on");
	}

}
