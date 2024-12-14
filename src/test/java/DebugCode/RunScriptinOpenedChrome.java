package DebugCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class RunScriptinOpenedChrome {
	
	@Test
	public void DebugCode() {
		//cd "C:\Program Files\Google\Chrome\Application\
		//chrome.exe --remote-debugging-port=9222 --user-data-dir=D:\ChromeData

		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("debuggerAddress","localhost:9222");
		WebDriver driver = new ChromeDriver(opt);
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='MV3Tnb']")).click();
	}

}
