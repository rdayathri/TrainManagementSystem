package command;

public class TrainTurnOff implements Command {
	Train train;
	
	public TrainTurnOff(Train train) {
		this.train = train;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		train.turnOff();
	}

}
