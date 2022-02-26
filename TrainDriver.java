package traindriver;
import command.*;
import state.*;
import facade.*;
public class TrainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainManager trainManager = new TrainManager();
		TrainSystem trainSystem = new TrainSystem(trainManager);
		//passenger commands
		Passenger passenger = new Passenger();
		Command boardTrainCommand = new BoardTrainCommand(passenger);
		Command unboardTrainCommand = new UnboardTrainCommand(passenger);
		Command payTicketCommand = new PayTicketCommand(passenger);
		//car attendant
		CarAttendant carAttendant = new CarAttendant();
		Command checkTicketCommand = new CheckTicketCommand(carAttendant);
		Command checkPassengerCommand = new CheckPassengerCommand(carAttendant);
		
		TrainFacade trainFacade = new TrainFacade(trainSystem, boardTrainCommand,
				unboardTrainCommand, payTicketCommand, checkTicketCommand,
				checkPassengerCommand);
		
		trainFacade.turnOn();
		System.out.println();
		trainFacade.payTicket();
		System.out.println();
		trainFacade.boardTrain();
		System.out.println();
		trainFacade.drive();
		System.out.println();
		trainFacade.checkTicket();
		System.out.println();
		trainFacade.brake();
		System.out.println();
		trainFacade.checkPassengers();
		System.out.println();
		trainFacade.turnOff();
		System.out.println();
		trainFacade.unboardTrain();
		
	}

}
