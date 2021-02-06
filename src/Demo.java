import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
	
		// SetProperty is method of ChromeDriver class, which will tell where chrome .exe file is located
		
		System.setProperty("webdriver.chrome.driver", "C:\\PSC\\Eclipse practice\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\PSC\\Eclipse practice\\Browser Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\PSC\\Eclipse practice\\Browser Drivers\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
		
		// Create driver object and we are assigning WebDriver..		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//get application url
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");		
		//String str= driver.getTitle();  we have passed obj.method as variable in sysout and concatenated in String using ++
		//so above step is not needed
		System.out.println("Browser title is " + driver.getTitle() + ".");
	
		

	}

}
