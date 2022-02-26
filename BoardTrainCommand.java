package command;

public class BoardTrainCommand implements Command {
	Passenger passenger;
	
	public BoardTrainCommand(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.passenger.boardTrain();
	}

}
