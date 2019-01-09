//package headfirst.command.undo;
/*Name : Thien Nguyen
 * Pattern assignmen 4
 * Command pattern
 * */
public class RemoteLoader {
 
//	public static void main(String[] args) {
//		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
// 
//		Light livingRoomLight = new Light("Living Room");
// 
//		LightOnCommand livingRoomLightOn = 
//				new LightOnCommand(livingRoomLight);
//		LightOffCommand livingRoomLightOff = 
//				new LightOffCommand(livingRoomLight);
// 
//		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
// 
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//		remoteControl.offButtonWasPushed(0);
//		remoteControl.onButtonWasPushed(0);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//
//		CeilingFan ceilingFan = new CeilingFan("Living Room");
//   
//		CeilingFanMediumCommand ceilingFanMedium = 
//				new CeilingFanMediumCommand(ceilingFan);
//		CeilingFanHighCommand ceilingFanHigh = 
//				new CeilingFanHighCommand(ceilingFan);
//		CeilingFanOffCommand ceilingFanOff = 
//				new CeilingFanOffCommand(ceilingFan);
//  
//		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//   
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//  
//		remoteControl.onButtonWasPushed(1);
//		System.out.println(remoteControl);
//		remoteControl.undoButtonWasPushed();
//	}
	
//	public static void main(String[] args) {
//		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//		
//		Light classroomLights[] = new Light[3];
//		Light classroomLight = new Light("Classroom");
//		
//		FullLightOnCommand classRoomLightOn = 
//				new FullLightOnCommand(classroomLights);
//		DimmerLightOnCommand classRoomLightDim = 
//				new DimmerLightOnCommand(classroomLight);
//		
//		// Set control for lot 0: Turn on full lighting and Dim the lights
//		remoteControl.setCommand(0, classRoomLightOn, classRoomLightDim);
//		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//		remoteControl.offButtonWasPushed(0);
//		remoteControl.onButtonWasPushed(0);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//
//		Projector projector = new Projector("Classroom");
//   
//		ProjectorOnCommand projectorOnCommand = 
//				new ProjectorOnCommand(projector);
//		ProjectorOffCommand projectorOffCommand = 
//				new ProjectorOffCommand(projector);
//  
//		remoteControl.setCommand(1, projectorOnCommand, projectorOffCommand);
//		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//  
//		remoteControl.onButtonWasPushed(1);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//		
//		Screen screen = new Screen("Classroom");
//		   
//		ScreenDropCommand screenDropCommand = 
//				new ScreenDropCommand(screen);
//		ScreenRaiseCommand screenRaiseCommand = 
//				new ScreenRaiseCommand(screen);
//  
//		remoteControl.setCommand(2, screenDropCommand, screenRaiseCommand);
//		
//		remoteControl.onButtonWasPushed(0);
//		remoteControl.offButtonWasPushed(0);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//  
//		remoteControl.onButtonWasPushed(2);
//		System.out.println(remoteControl);
//		//remoteControl.undoButtonWasPushed();
//	}
	
	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(); //Initialize remote control
		
		Light classroomLights[] = new Light[3]; //initialize number of classroom lights
		Projector projector = new Projector("Classroom"); //initialize projector
		Screen screen = new Screen("Classroom"); //initialize screen
		
		DimmerLightOnCommand classRoomLightDim = 
				new DimmerLightOnCommand(classroomLights); //dim the lights command
		ScreenDropCommand screenDropCommand = 
				new ScreenDropCommand(screen); //drop the screen command
		ProjectorOnCommand projectorOnCommand = 
				new ProjectorOnCommand(projector); //turn on projector command

		Command[] startClass = {classRoomLightDim, screenDropCommand, projectorOnCommand}; //array of start class command
		
		FullLightOnCommand classRoomLightOn = 
				new FullLightOnCommand(classroomLights); //full lighting on command
		ScreenRaiseCommand screenRaiseCommand = 
				new ScreenRaiseCommand(screen); //raise screen command
		ProjectorOffCommand projectorOffCommand = 
				new ProjectorOffCommand(projector); //turn off projector command		 
		
		Command[] endClass = {classRoomLightOn, screenRaiseCommand, projectorOffCommand}; //array of end class command
		
		MacroCommand startClassMacroCommand = new MacroCommand(startClass); //macro command for start class
		MacroCommand endClassMacroCommand = new MacroCommand(endClass); // macro command for end class
		
		//set button for start and end class macro command
		//slot 0, button 1 is start class, button 2 is end class
		remoteControl.setCommand(0, startClassMacroCommand, endClassMacroCommand); 
		
		//start class
		System.out.println("START CLASS");
		remoteControl.onButtonWasPushed(0); //start class macro button execute

		//end class
		System.out.println("END CLASS");
		remoteControl.offButtonWasPushed(0); //end class macro button execute
		
		System.out.println(remoteControl); //print the remote control
	}
}
