//package headfirst.command.undo;

public class ProjectorOffCommand implements Command {
	Projector projector;
 
	public ProjectorOffCommand(Projector projector) {
		this.projector = projector;
	}
 
	public void execute() {
		projector.off();
	}
 
	public void undo() {
		projector.on();
	}
}
