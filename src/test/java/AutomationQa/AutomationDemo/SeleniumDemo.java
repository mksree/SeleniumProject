package AutomationQa.AutomationDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
;



public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//chromedriver driver =new chromedriver
//chromedriver, fireforxdriver,mozilladriver all driver class's has selenium methods 
//same method name in all driver class's
// these class has same methods so on top of all these class's we have a interface 
//is called webdriver it provides set of browser automation methods
//and also webdriver interface has there own implementation methods also so to overcome this 
//we need create object of chrome driver
//webdriver driver=new chromedriver(); this way we can import chrome driver class only
		//System.setProperty("webdriver.chrome.driver", "");
		//WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "");
		/*WebDriver driver= new FirefoxDriver();
		driver.get("https://www.guru99.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		int[] arry={1,2,3,4,5};
		for(int i=0; i<arry.length; i++)
		System.out.println(arry[i]);
		
		String[] name= {"shobha","radha","shiva","shiva"};
		for(int i=0; i<name.length; i++ );{
		//System.out.println(name[i]);
		}
		for(String s:name) {
			System.out.println(s);
		}
	}

}
