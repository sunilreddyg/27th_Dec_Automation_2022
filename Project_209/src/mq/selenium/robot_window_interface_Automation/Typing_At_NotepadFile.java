package robot_window_interface_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Typing_At_NotepadFile 
{

	public static void main(String[] args) throws IOException, AWTException, Exception 
	{
		
		//Running Executable file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		
		//Type Hello Using Robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Down Key
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_F);	
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_S);
		

		//Release Down Keys
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
	}

}
