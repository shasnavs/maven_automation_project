package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Storenvybase {
public static WebDriver driver;

	@BeforeClass
	public void test()
	{
		driver=new ChromeDriver();
		driver.get("https://www.storenvy.com/login?user_return_to=https%3A%2F%2Fwww.storenvy.com%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
				
	}

}
