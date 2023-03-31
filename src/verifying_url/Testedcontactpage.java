package verifying_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testedcontactpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit\\eclipse-workspace\\testing_ecoders\\alljarfiles\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://127.0.0.1:5000/contact");
     Thread.sleep(5000);
     
 	String titleofpage = driver.getTitle();
    System.out.println(titleofpage);
    
    
    String url = driver.getCurrentUrl();
    System.out.println(url);
    
    
    String source = driver.getPageSource();
    System.out.println(source);
    
    String expectedurl="http://127.0.0.1:5000/contact";
    if(expectedurl.equals(url))
    {
    	System.out.println("url matched test case passed");
    }
    else {
    	System.out.println("url not matched, test case failed");
    }
    driver.quit();
    
	
	

}

}
