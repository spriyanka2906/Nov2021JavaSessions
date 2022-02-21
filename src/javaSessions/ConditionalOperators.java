package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte a=056;
//		System.out.println(a);
		
		//065--> 5 X8^0
		//065=(0 x 8^2)+(6 x 8^1) +(5 x 8^0)=53 decimal num
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail");
		}
		if(true) {
			System.out.println("Hi");
		}else {
			System.out.println("Bye"); //dead code
		}
		
		boolean flag=true;
		if(flag) {
			
			System.out.println("Selenium");
		}else {
			System.out.println("UFT");
		}
		
		double d1=12.33;
		double d2=12.34;
		
		if(d1==d2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}
		
		String s1="Hello";
		String s2="Hello";
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Not equal");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Not Equal");
		}
		if(s1==s2) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail");
		}
		
		//
		
		int total=95;
		if(total<=100) {
			if(total>=95) {
				System.out.println("A++");
			}else {
			System.out.println("Grade A");
			}
		}
		
		//
		String browser="chrome";
		if(browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		if(browser.equals("firefox")) {
			System.out.println("Launch firefox");
		}
		if(browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		if(browser.equals("IE")) {
			System.out.println("Launch IE");
		}
		else {
			System.out.println("Please pass the right browser");
		}
		
		
		
		
		
	}

}
