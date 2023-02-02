package mq.selenium.interactions.mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_ElementTo_Target 
{

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		WebElement TrashBin=driver.findElement(By.xpath("//div[@class='trash']"));
	
		
		//Create object for actions class
		Actions action=new Actions(driver);
		
		//Drag Object to target using original method
		action.dragAndDrop(Doc1, TrashBin).perform();
		action.dragAndDrop(Doc2, TrashBin).perform();
		
		//Drag and drop using mouse interaction commands
		action.clickAndHold(Doc3).moveToElement(TrashBin).release().perform();
		action.clickAndHold(Doc4).moveToElement(TrashBin).release().perform();
		
		
	}

}
