package WebDriver_Architecture;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElement() {
		System.out.println("FE");
		
	}

	@Override
	public void findElements() {
		System.out.println("FES");
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter url");
	}

	@Override
	public String getTitle() {
		return "Some title";
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "http://www.abc.com";
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
