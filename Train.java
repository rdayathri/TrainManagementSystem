package command;

public class Train {
	String trainName;
	public void setName(String name) {
		this.trainName = name;
	}
	public void drive() {
		System.out.println("Train Moving");
	}
	public void brake() {
		System.out.println("Train braking");
	}
	public void turnOn() {
		System.out.println("Train turned on");
	}
	public void turnOff() {
		System.out.println("Train turned off");
	}
}
