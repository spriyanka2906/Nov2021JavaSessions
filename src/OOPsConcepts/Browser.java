package OOPsConcepts;

public class Browser {

	//launch a browser
	//input parameter: name(String): firefox/Safari/IE/Chrome
	//return: void
	//return boolean
	public boolean launchBrowser(String name) {
		System.out.println("Browser name is:"+name);
		
		if(name.equalsIgnoreCase("chrome")) {
			System.out.println("Launch Chrome");
			return true;
		} else if(name.equalsIgnoreCase("firefox")) {
			System.out.println("Launch Firefox");
			return true;
		} else if(name.equalsIgnoreCase("Safari")) {
			System.out.println("Launch Safari");
			return true;
		} else if(name.equalsIgnoreCase("IE")) {
			System.out.println("Launch IE");
			return true;
		} else {
			System.out.println("Please pass the right browser.....");
			return false;
		}
		
	}
	
	
	
	public boolean openBrowser(String brName) {
		
		System.out.println("Browser name:" + brName);
		switch (brName.toLowerCase()) {
		case "chrome":
			System.out.println("Launch chrome");
			return true;
			//break;------ return should be the last statement
		case "firefox":
			System.out.println("Launch firefox");
			return true;
			//break;----------break and return cannot be placed together in same block
		case "IE":
			System.out.println("Launch IE");
			return true;
			//break;
		default:
			System.out.println("Please pass the right browser:" + brName);
			return false;
			//break;
		}
		
	}
		
	//main() will never return anything as it is called by JVM
	public static void main(String[] args) {
		Browser br=new Browser();
		boolean flag=br.openBrowser("chrome");
		System.out.println(flag);
		
//		if(br.launchBrowser("opera"))
//		{
//			System.out.println("Br is launched------");
//		} else {
//			System.out.println("TC is failed...............");
//			
//		}
	}

}
