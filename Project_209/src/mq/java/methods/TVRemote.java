package mq.java.methods;

public class TVRemote 
{	
	 public void ON() 
	 {
		System.out.println("Power is On");
	 }
	 
	 public void OFF() 
	 {
		System.out.println("Power is Off");
	 }
	 
	 public void NextChannel()
	 {
		 System.out.println("Moved to Next Channel");
	 }
	 
	 public static void main(String[] args) 
	 {
		new TVRemote().ON();
		new TVRemote().OFF();
		new TVRemote().NextChannel();
	 }
	 
}
