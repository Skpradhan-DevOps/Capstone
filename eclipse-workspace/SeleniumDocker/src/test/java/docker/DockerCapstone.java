package docker;

import org.openqa.selenium.remote.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DockerCapstone {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		WebDriver driver = new ChromeDriver(option);
		
		URL url=new URL("http://localhost:4444/wd/hub");
		
		
		//DesiredCapabilities	dc= new DesiredCapabilities();
		//DesiredCapabilities SSLCertificate = DesiredCapabilities.chrome();
		
		RemoteWebDriver drivers = new RemoteWebDriver(url,(Capabilities) driver);
		//drivers.get("https://www.aetna.com/");
		drivers.get("https://www.google.com/");
		drivers.findElement(By.name("q")).sendKeys("Aetna");
		System.out.println("Title is "+drivers.getTitle());
		
		Thread.sleep(5000);
		drivers.quit();
		

	}

}
