package ExceptionHandling;

public class FinallyInterviewQues {

	public static int getMarks(String name) {
		System.out.println("Getting marks for:" + name);
		
		int marks=0;
		if(name.equals("Ram")) {
			try {
					//marks=90/0;
				marks=90/2;
				System.exit(0);// 0 or 1 to shutdown the JVM
				System.exit(1); //immediately terminates the JVM--- status code to shutdown the JVM=1
				return marks;
			} catch(ArithmeticException e) {
				System.out.println("AE is coming");
				return -2;
			} finally {
				System.out.println("Student has failed");
				return -3;
			}
			
		}else if(name.equals("Nikki")) {
			marks=95;
		}else if(name.equals("Sri")) {
			marks=85;
		}else {
			System.out.println("Student not found");
			return -1;
		}
		return marks;
	}
	
	public static void main(String[] args) {
		
		int m=getMarks("Ram");
		System.out.println(m);

	}

}

//Output: 
/**Getting marks for:Ram
AE is coming
Student has failed
-3
 * 
 * 
 */

