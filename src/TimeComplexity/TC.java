package TimeComplexity;

public class TC {

	public static void main(String[] args) {

		int i=10;
		System.out.println(i);

		//TC: defined by Big O--->O(1)----Constant time
			//defined the time of execution
		
		
		//1 to 10:
		for (int p= 1; p< 10; p++) {
			System.out.println(p);
		}
		
		//1+n+n+n =>1+3n=>3n+1=>Linear equation
		//3n=O(n)
		
		for (int p= 1; p< 10; p++) {
			for (int q = 1; q < 10; q++) {
				System.out.println(p+ " "+q);
			}
		}
		//(1+n+n)(1+n+n+n)==>(1+2n)(1+3n)==>1+3n+2n+6n^2==>6n^2+5n+1==>Quadratic equation
		//6n^2+5n==>n(6n+5)==>6n^2==>O(n^2)
		

		for (int p= 1; p< 10; p++) {
			for (int q = 1; q < 10; q++) {
				for (int r = 1; r < 10; r++) {
					System.out.println(p+ " "+q+" "+r);	
				}
			}
		}
		
		//(1+n+n)(1+n+n)(1+n+n+n)==>(1+2n)(1+2n)(1+3n)==>....==>O(n^3)
	}

}
