package ExceptionHandling;

public class ThrowsKeyword {

	public void m1()  {
		m2();
	}
	
	public void m2() {
		//m3();
		
		try {
			m3();
		}catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
	}
	public void m3() throws ArithmeticException{
		int i=9/0;
//		try {
//			int i=9/0;
//		}catch(ArithmeticException e) {
//			System.out.println("AE is coming");
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();

	}

}
