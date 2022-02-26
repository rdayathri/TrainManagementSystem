package command;

public class PayTicketCommand implements Command {
	Passenger passenger;
	
	public PayTicketCommand(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.passenger.payTicket();
	}

}
