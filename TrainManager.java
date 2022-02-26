package command;

public class TrainManager {
	Command slot;
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	public void execute() {
		slot.execute();
	}
}
