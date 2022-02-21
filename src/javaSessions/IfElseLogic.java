package javaSessions;

public class IfElseLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser="Chrome ";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("Launch Chrome");
//		}else if(browser.equals("firefox")) {
//			System.out.println("Launch firefox");
//		}else if(browser.equals("Safari")) {
//			System.out.println("Launch Safari");
//		}else if(browser.equals("IE")) {
//			System.out.println("Launch IE");
//		}else {
//			System.out.println("Please pass the right browser");
//		}
//		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch firefox");
			break;
		case "safari":
			System.out.println("Launch safari");
			break;
		case "ie":
			System.out.println("Launch ie");
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
		
		//
		int total=100;
		switch (total) {
		case 100:
			System.out.println("A++");
			break;
		case 90:
			System.out.println("Grade A");
			break;
		case 50:
			System.out.println("Grade B");
			break;
		default:
			System.out.println("Fail");
			break;
			
			//User level testcases-ARBAC/Permission
			//Different test environment
			//cross browsers
			//cross devices
			//cross cloud: AWS, Azure, Docker,GCP,Local
			//Localization-multi languages
			
			
			
			
			
		}
		
	}

}
