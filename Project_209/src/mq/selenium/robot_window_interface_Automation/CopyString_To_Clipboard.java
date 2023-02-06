package robot_window_interface_Automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString_To_Clipboard {

	public static void main(String[] args) throws Exception {
		
		//Running Executable file
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		
		
		String path="D:\\14_Sep_8AM_2022\\Project_207\\Screens\\image.png";
		
		//Select string
		StringSelection spath=new StringSelection(path);
		
		//Get default system Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		
		//set Content to Clipboard memory
		clipboard.setContents(spath, spath);
		
		//Type Hello Using Robot
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Control+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release Downkey Control
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
