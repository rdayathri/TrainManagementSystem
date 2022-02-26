package facade;
import command.*;
import state.*;
public class TrainFacade {
	//private TrainManager trainManager;
	private TrainSystem trainSystem;
	private Command boardTrainCommand;
	private Command unboardTrainCommand;
	private Command payTicketCommand;
	private Command checkTicketCommand;
	private Command checkPassengerCommand;

	public TrainFacade(TrainSystem trainSystem, Command boardTrainCommand, Command unboardTrainCommand,
			Command payTicketCommand, Command checkTicketCommand, Command checkPassengerCommand) {
		this.trainSystem = trainSystem;
		this.boardTrainCommand = boardTrainCommand;
		this.unboardTrainCommand = unboardTrainCommand;
		this.payTicketCommand = payTicketCommand;
		this.checkTicketCommand = checkTicketCommand;
		this.checkPassengerCommand = checkPassengerCommand;
	}
	
	public void turnOn() {
		trainSystem.turnOn();
	}
	public void boardTrain() {
		boardTrainCommand.execute();
	}
	public void unboardTrain() {
		unboardTrainCommand.execute();
	}
	public void payTicket() {
		payTicketCommand.execute();
	}
	public void checkTicket() {
		checkTicketCommand.execute();
	}
	public void checkPassengers() {
		checkPassengerCommand.execute();
	}
	public void drive() {
		trainSystem.drive();
	}
	public void brake() {
		trainSystem.brake();
	}
	public void turnOff() {
		trainSystem.turnOff();
	}
	
}
