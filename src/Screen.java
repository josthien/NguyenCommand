//package headfirst.command.undo;

public class Screen {
	String location;
	
	public Screen(String location) {
		this.location = location;
	}
  
	public void raise() {
		System.out.println(location + " screen is raised");
	}
  
	public void drop() {
		System.out.println(location + " screen is dropped");
	}
}
