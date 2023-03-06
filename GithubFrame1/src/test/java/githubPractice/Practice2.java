package githubPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Click here for output>>']")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		//a.dismiss();
		
	}

}
