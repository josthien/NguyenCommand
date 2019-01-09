//package headfirst.command.undo;

public class ProjectorOnCommand implements Command {
	Projector projector;
 
	public ProjectorOnCommand(Projector projector) {
		this.projector = projector;
	}
 
	public void execute() {
		projector.on();
	}
 
	public void undo() {
		projector.off();
	}
}
