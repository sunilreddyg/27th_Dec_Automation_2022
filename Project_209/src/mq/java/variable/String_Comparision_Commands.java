package mq.java.variable;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String allow to store set of characters
		 * 	        => String is not only datatype and also called as class
		 * 			=> Because string contains set of events to validate
		 * 					stored characters...
		 * 			
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false..
		 * 		Note:-- COmparision is casesensitive..
		 */
		 String Exp_Res="Account Created";
		 String Act_Res="account Created";
		 
		 boolean flag=Exp_Res.equals(Act_Res);
		 System.out.println("Equal Comparision Status is --> "+flag);
		
		
		 /*
		  * EuqualIgnoreCase:-->
		  * 		method verify equal comparision between two strings
		  * 		by ignoring casesensitive..
		  */
		 boolean flag1=Exp_Res.equalsIgnoreCase(Act_Res);
		 System.out.println("Equalignorecase Comparision is -->"+flag1);
		 
		 
		 /*
		  * contains:-->
		  * 		method verify sub string available at main String..
		  * 		=>SubString character sequence available at main string
		  */
		 String status="Account 100 Created";
		 System.out.println(status.contains("Account"));
		 System.out.println(status.contains("100"));
		 System.out.println(status.contains("Created"));
		 System.out.println(status.contains("Account Created"));
		 
		 
		 /*
		  * substring:-->
		  * 	method get substring from main string..
		  */
		 String AccountNum="111101235555";
		 String LastDigits=AccountNum.substring(8);
		 System.out.println("Account Last Digits are --> "+LastDigits);
		 
		 String MiddleDigits=AccountNum.substring(4, 8);
		 System.out.println("Account Middle Digits are --> "+MiddleDigits);
		 
		 

			/*
			 * length:-->
			 * 		Method get number of charactes available with
			 * 		in string
			 */
			String Mobile="9030248855";
			int len=Mobile.length();
			System.out.println("Mobile Number length is --> "+len);
			System.out.println(len==10);  //== Double equals is boolean comparision 
			
			
			/*
			 * Trim:-->
			 * 	Method trim extra spaces with in String
			 * 		[It only Trims left and right spaces only]
			 */
			String PinCode="    500075    ";
			System.out.println("Before trim ---> "+PinCode.length());
			String NewPincode=PinCode.trim();
			System.out.println("After trim ---> "+NewPincode.length());
			
		 
			/*
			 * isEmpty:-->
			 * 		Method verify string empty status and return
			 * 		boolean value true/false
			 */
			String var1="";
			String var2="Hi";
			System.out.println("var1 empty status is ---> "+var1.isEmpty());
			System.out.println("Var2 empty status is ---> "+var2.isEmpty());
			
			
			/*
			 * startswith:-->
			 * 			Method verify given string started with expected characters
			 * 			and return boolean value
			 */
			String AccountNumber="111122227777";
			boolean flag5=AccountNumber.startsWith("1111");
			System.out.println("Starts with Comparision is --> "+flag5);
			
			
			/*
			 * endswith:-->
			 * 			Method verify given string ends with expected characters
			 * 			and return boolean value
			 */
			boolean flag6=AccountNumber.endsWith("7777");
			System.out.println("ends with Comparision is --> "+flag6);
			
			
			/*
			 * ToLowerCase:-->
			 * 		method convert all Uppercase characters
			 * 		into lowercase
			 */
			String toolname="WebDriver";
			System.out.println(toolname.toLowerCase());
			
			/*
			 * toUppercase:-->
			 * 		method convert all lowercase characters 
			 * 		into uppercase
			 */
			System.out.println(toolname.toUpperCase());
			
			
			
			/*
			 * charsAt:-->
			 * 		Method return single character using index number
			 */
			String browsername="Chrome,Firefox";
			char ch=browsername.charAt(9);
			System.out.println("charcters available at 6th index number ---> "+ch);
			
			
			/*
			 * concat:-->
			 * 			Method club two string 
			 */
			String firstname="SunilReddy";
			String surname="gajjala";
			System.out.println(firstname.concat(surname));
			System.out.println(firstname+surname);
			
			
			/*
			 * replace:-->
			 * 		Replace old characters with New characters 
			 */
			String Rep=browsername.replace("o", "i");
			System.out.println("After replace character is --> "+Rep);
			System.out.println(browsername.replaceAll("o", "i"));
			
			
			String Price="$25,000";
			String NewPrice=Price.replace("$", "").replace(",", "");
			int Latest=Integer.parseInt(NewPrice); //Converting string value to integer value
			if(Latest > 20000)
				System.out.println("New price is Updated");
			else
				System.out.println("New price is not updated");
	}

}
