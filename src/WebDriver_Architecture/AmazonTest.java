package WebDriver_Architecture;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browser="chrome";
	
		
		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//SafariDriver driver=new SafariDriver();
		
		//TopCasting concept
		
		
		WebDriver driver=null;
		
		if(browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			 driver=new FirefoxDriver();
		}else if(browser.equals("safari")){
			 driver=new SafariDriver();
		}else {
			System.out.println("Please pass the right browser");
		}
		
		
		driver.get("http://www.amazon.com");
		String title=driver.getTitle();
		System.out.println("Page title"+title);
		
		String url=driver.getUrl();
		System.out.println("URL is:"+url);
		
		driver.findElement();
		driver.findElements();
		
		driver.sendKeys("naveen@gmail.com");
		driver.sendKeys("test123");
		driver.click();
		
		driver.close();
		

	}

}
