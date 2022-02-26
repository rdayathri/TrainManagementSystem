package command;

public class CheckTicketCommand implements Command {
	CarAttendant carAttendant;
	
	public CheckTicketCommand(CarAttendant carAttendant) {
		this.carAttendant = carAttendant;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		carAttendant.checkTicket();
	}

}
