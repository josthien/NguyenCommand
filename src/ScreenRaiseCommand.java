//package headfirst.command.undo;

public class ScreenRaiseCommand implements Command {
	Screen screen;
 
	public ScreenRaiseCommand(Screen screen) {
		this.screen = screen;
	}
 
	public void execute() {
		screen.raise();
	}
 
	public void undo() {
		screen.drop();
	}
}
