package state;
import command.*;
import command.TrainManager;

public class TurnOffState implements State{
	TrainSystem trainSystem;
	TrainManager trainManager;
	public TurnOffState(TrainSystem trainSystem, TrainManager trainManager) {
		// TODO Auto-generated constructor stub
		this.trainSystem = trainSystem;
		this.trainManager = trainManager;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Turn train on first");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("Train not moving yet");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Train already off");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turning train on");
		Train train = new Train();
		Command trainTurnOnCommand = new TrainTurnOn(train);
		trainManager.setCommand(trainTurnOnCommand);
		trainManager.execute();
		trainSystem.setState(trainSystem.getOnState());
	}

}
