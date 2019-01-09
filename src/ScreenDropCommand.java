//package headfirst.command.undo;

public class ScreenDropCommand implements Command {
	Screen screen;
 
	public ScreenDropCommand(Screen screen) {
		this.screen = screen;
	}
 
	public void execute() {
		screen.drop();
	}
 
	public void undo() {
		screen.raise();
	}
}
