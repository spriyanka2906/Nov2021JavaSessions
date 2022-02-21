package OOPsConcepts;

public class Ecomm {

	/**Method Overloading
	 * when we have different methods:
	 * 1. within the same class
	 * 2.with the same name
	 * 3.with different input parameters
	 * 4.with sequence and order of params
	 * 
	 */
	
	/**
	 * Method Overloading---Polymorhism--Poly(Many)--Morphism(Forms)----also known as Compile time(Static) Polymorhism
	 * 
	 * @return
	 */
	
	//0 params
	public int test() {
		System.out.println("Test Method");
		return 10;
	}
	//method signature is different
	public String test(int i) {
		System.out.println("Test Method" +i);
		return "IBM";
	
	}
	//1 params
	public void test(String i) {
		System.out.println("Test Method" +i);
	}
	//2 params
	public void test(int i,int j) {
		System.out.println("Test Method" +(i+j));
	
	}
	/**duplicate to to int params
	public void test(int j,int i) {
		System.out.println("Test Method" +(i+j));
	
	}
	*/
	public void test(int i,double j) {
		System.out.println("Test Method" +(i+j));
	
	}
	
	//Sequence of parameters 
	public void test(int i,String j) {
		System.out.println("Test Method" +(i+j));
	
	}
	
	public void test(String i,int j) {
		System.out.println("Test Method" +(i+j));
	
	}
	
/**
 * Practical example for method overloading
 * @param args --LOGIN page
 */

	public void login() {
		
	}
	 public void login(String un, String pwd) {
		 
	 }
	 public void login(String un,String pwd,String role) {
		 
	 }
 public void login(String un,String pwd,long ph) {
		 
	 }
 public void login(String socialMediaAcc,int otp) {
	 
 }

 /**
  * Practical example for method overloading
  * @param args --Search 
  */

 public void search() {
	 
 }
 
 public void search(String productName) {
	 
 } 
 
 public void search(String productName, String Color) {
	 
 }
 
 public void search(String productName, String Color, int price) {
	 
 }
 
 
 /**
  * Practical example for method overloading
  * @param args --Payment page
  */

 
 public void doPayment(String upi) {
	 
	 
 }
 public void doPayment(String upi,int otp) {
	 
	 
 } 
 public void doPayment(String upi,int otp,String prodtype) {
	 
	 
 }  
 
 public void doPayment(String payPal,String pwd, int otp) {
	 
	 
 }
 /**
  * Practical example for method overloading
  * @param args --Uber: booking
  */
 
 
 public void booking()
 {
 
 }
 
 public void booking(String st, String end)
 {
 
 }
	
 public void booking(String st,String end,String carType)
 {
 
 }
	
 public void booking(String st,String end, String carType, int users)
 {
 
 }
	
	public static void main(String[] args) {
		Ecomm obj=new Ecomm();
		int n=obj.test();
		System.out.println(n);
		
		String str=obj.test(100);
		System.out.println(str);
		
		
		
		
	}

}
