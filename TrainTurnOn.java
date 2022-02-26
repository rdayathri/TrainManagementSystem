package command;

public class TrainTurnOn implements Command {
	Train train;
	
	public TrainTurnOn(Train train) {
		this.train = train;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		train.turnOn();
	}

}
