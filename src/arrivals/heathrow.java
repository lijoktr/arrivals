package arrivals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heathrow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/lijom/Documents/chromedriver.exe");
		
		//ChromeDriver driver = new ChromeDriver(); 
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.qatarairways.com/en-gb/homepage.html");
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("cookie-close-accept-all")).click();
		driver.findElement(By.id("cookie-close")).click();
		System.out.println("cookies");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("flightstatus-tab")).click();
		System.out.println("stats");
		
		Thread.sleep(2000);
				
		driver.findElement(By.id("flightStatusFrom")).sendKeys("Doha DOH",Keys.TAB, "LHR",Keys.TAB);
		System.out.println("FLIGHT FROM");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[8]/main/div/div/div/hero-component/div[3]/div/div/div/div/div[4]/div/div[2]/div[4]/div/button")).click();
		System.out.println("search");
		
		Thread.sleep(4000);
		
		//driver.close();

	}

}
