package DebugCode;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCapabilities {
	
	@Test
	public void getChromeBrowserCapabilities() {
		ChromeDriver driver = new ChromeDriver();
		Capabilities cap = driver.getCapabilities();
		Map<String, Object> mycap = cap.asMap();
		System.out.println(mycap);
	}

}
