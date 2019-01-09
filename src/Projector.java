//package headfirst.command.undo;

public class Projector {
	String location;
	
	public Projector(String location) {
		this.location = location;
	}
  
	public void off() {
		System.out.println(location + " projector is off");
	}
  
	public void on() {
		System.out.println(location + " projector is on");
	}
}
