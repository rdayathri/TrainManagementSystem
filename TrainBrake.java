package command;

public class TrainBrake implements Command {
	Train train;
	
	public TrainBrake(Train train) {
		this.train = train;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		train.brake();
	}

}
