package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");
		int i=0;// local variable must be initialized
		
		try {
//			int i=9/0;
			 i=9/3;
		} catch(ArithmeticException e) {
			System.out.println("AE is coming");
		}
		finally {
			System.out.println("This is finally block");
			System.out.println(i);
			
			//int k=9/0;
		}

	}

}
