package state;
import command.*;
public class TrainSystem {
	State brakeState;
	State driveState;
	State onState;
	State offState;
	
	State state;
	
	public TrainSystem(TrainManager trainManager) {
		brakeState = new BrakeState(this, trainManager);
		driveState = new DriveState(this, trainManager);
		onState = new TurnOnState(this, trainManager);
		offState = new TurnOffState(this,trainManager);
		
		state = offState;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getBrakeState() {
		return brakeState;
	}
	public State getDriveState() {
		return driveState;
	}
	public State getOnState() {
		return onState;
	}
	public State getOffState() {
		return offState;
	}
	public void brake() {
		state.brake();
	}
	public void drive() {
		state.drive();
	}
	public void turnOn() {
		state.turnOn();
	}
	public void turnOff() {
		state.turnOff();
	}
	public String toString() {
		return "Train is in " + state;
	}
	
}
