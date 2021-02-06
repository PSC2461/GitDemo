import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeJava {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\PSC\\Eclipse practice\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://eag.synechron.com/SYNE.UI/");		
		driver.findElement(By.id("//input[@id='empsearch']")).sendKeys("punjaji");
		

	}

}
