package command;

public class CheckPassengerCommand implements Command {
	CarAttendant carAttendant;
	
	public CheckPassengerCommand(CarAttendant carAttendant) {
		this.carAttendant = carAttendant;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.carAttendant.lookAfterPassagers();
	}

}
