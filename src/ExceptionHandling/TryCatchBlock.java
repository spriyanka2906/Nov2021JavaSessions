package ExceptionHandling;

public class TryCatchBlock {

	//Two types:
		//Compile time: Checked Exception------Ex: Down casting -fileNotFoundException
		//Run time: Unchecked Exception
	
	String name;
	
	public static void main(String[] args) {

//		int i=9/0; //Runtime exception
//		int k[]=new int[2];
//		k[4]=20; //ArrayIndexOutOfBoundsException----at runtime

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj=new TryCatchBlock();
		obj=null;
		
		try {
			obj.name="Kabir";
		}catch(NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}
		
		
		try {
			
			//int i=9/0;
			//int i=9/3;
			int k[]=new int[2];
			k[4]=20;
			
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			
		}
//		catch(Throwable e) {
//			System.out.println("Some Exception is coming");
//			e.printStackTrace();
//		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException is coming....");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming....");
			e.printStackTrace();
		}
//		catch(NullPointerException e) {
//			System.out.println("NPE is coming....");
//			e.printStackTrace();
//		}
		
							
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
		
		
		
	}

}
