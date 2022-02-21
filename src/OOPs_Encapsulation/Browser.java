package OOPs_Encapsulation;

public class Browser {

	//Public layer to access private methods 
	public void launchBrowser() {
		
		System.out.println("Trying to launch Chrome.......");
		checkOSCompatible();
		checkBrowserVersion();
		enoughRAM();
		isBrowserUgraded();
		System.out.println("Browser is launched.....");
	}
	
	private void checkOSCompatible() {
		
		System.out.println("checkOSCompatible.......");
	}	
	
	private void checkBrowserVersion() {
		
		System.out.println("checkBrowserVersion.......");
	}
	
	private void enoughRAM() {
		
		System.out.println("enoughRAM......");
	}
	
	private void isBrowserUgraded() {
		
		System.out.println("isBrowserUgraded......");
	}
	
}
