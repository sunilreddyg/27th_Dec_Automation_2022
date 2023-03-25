package ui_verificationCommands.getCssvalue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Check_BackGround_Color 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Element=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
	
		//Get Text Font name
		String Fontname=Element.getCssValue("font-family");
		System.out.println(Fontname);
		
		//Get Object visible status
		String DisplayValue=Element.getCssValue("display");
		System.out.println(DisplayValue.equals("block"));
		
		
		//Get Font Color
		String Act_FontColor=Element.getCssValue("color");
		System.out.println("Actual Color Code in RGBA is --> "+Act_FontColor);

		String Exp_Color_in_HEX="#ff7b1d";
		
		Color color=Color.fromString(Exp_Color_in_HEX);
		//Converting ActColor into Hext format
		if(color.asRgba().equals(Act_FontColor))
			System.out.println("Color is matching");
		else
			System.out.println("Color is mismatched");
		
	}

}
