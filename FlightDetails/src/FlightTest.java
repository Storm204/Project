import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlightTest
{
	private static WebDriver driver;
	
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\ADM-IG-HWDLAB1B\\Desktop\\AdvanceSelenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Goibibo-Flight&campaign=DF-Brand-EM&gclid=EAIaIQobChMIueiMqKaD3wIVROd3Ch1JlAZyEAAYASAAEgKBKvD_BwE");
	}
	
	
}
