package command;

public class TrainDrive implements Command {
	Train train;
	public TrainDrive(Train train) {
		this.train = train;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		train.drive();
	}

}
