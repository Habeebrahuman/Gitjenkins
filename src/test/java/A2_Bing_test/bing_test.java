package A2_Bing_test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bing_test {
	@Test
	public void validategoogle() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//textarea[@id=\'sb_form_q\']")).sendKeys("Theni");
		driver.findElement(By.xpath("//textarea[@id=\'sb_form_q\']")).submit();
		
		System.out.println(driver.getTitle());
		File f = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\shrah\\workspace\\gitandjenkins_project\\Screenshot\\bing.png"));
		
		
		
		
	}

}
