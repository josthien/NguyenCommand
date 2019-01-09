//package headfirst.command.undo;

public class DimmerLightOffCommand implements Command {
	Light[] lights;
	int prevLevel;

	public DimmerLightOffCommand(Light[] lights) {
		this.lights = lights;
	}
	
	public void execute() {
		for(int i=0; i<lights.length; i++) {
			lights[i] = new Light("Classroom");
			lights[i].dim(100);
		}
	}
	
	public void undo() {
		for(int i=0; i<lights.length; i++) {
			lights[i].dim(prevLevel);
		}
	}
}
