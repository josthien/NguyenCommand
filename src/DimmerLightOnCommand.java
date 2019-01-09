//package headfirst.command.undo;

public class DimmerLightOnCommand implements Command {
	Light[] lights;
	int prevLevel;

	public DimmerLightOnCommand(Light[] lights) {
		this.lights = lights;
	}
	
	public void execute() {
		for(int i=0; i<lights.length; i++) {
			lights[i] = new Light("Classroom");
			lights[i].dim(20);
		}
	}
	
	public void undo() {
		for(int i=0; i<lights.length; i++) {
			lights[i].dim(prevLevel);
		}
	}
}
