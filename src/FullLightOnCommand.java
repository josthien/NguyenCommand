//package headfirst.command.undo;

public class FullLightOnCommand implements Command {
	Light[] lights;
 
	public FullLightOnCommand(Light[] lights) {
		this.lights = lights;
	}
 
	public void execute() {
		for(int i=0; i<lights.length; i++) {
			lights[i] = new Light("Classroom");
			lights[i].on();
		}
	}
 
	public void undo() {
		for(int i=0; i<lights.length; i++) {
			lights[i].off();	
		}
	}
}
