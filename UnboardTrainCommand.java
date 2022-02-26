package command;

public class UnboardTrainCommand implements Command {
	Passenger passenger;
	
	public UnboardTrainCommand(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.passenger.unboardTrain();
	}

}
