package javaSessions;

import java.util.Iterator;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//print 1 to 10
		
		/**
		 * Loop-- (1 to 100){
		 * 
		 * create a user logic
		 * 
		 *
		 * }
		 * 
		 * 
		 * create a user1 logic
		 * create a user2 logic
		 * create a user3 logic
		 * 
		 * 
		 * 
		 */
		//1. while loop
		
		//when to use while loop--use cases
		
		/**Usecases: when we are not sure about how many tiimes iterations we have to perform
		 * 		ex: to check the page loading	 
		 * 			Web element is coming on page after 10/20/30/5 secs
		 * 			pagination-1 2 3 4 5...100-- not sure how many times we have to visit that page
		 * 			waiting for the server to respond
		 * 			Carousel handling
		 */
		
		int i=1;
		while(i<=10) {
			System.out.println(i);//111111111....... infinite if i++ statement is not there
			//i++;
			//i=i+1
			++i;
		}
		
		//Example of infinite loop
//		while(true) {
//			System.out.println("Welcome to Taj hotel - 24x7");
//		}
//		System.out.println("Bye"); // Unreachable code
//		
//		while(false) {
//			System.out.println("Welcome to Taj Hotel -24x7"); //unreachable code
//		}
		
		boolean flag=true;
		int num=1;
		while(flag) {
			System.out.println("Welcome to Taj hotel - 24x7");
			num++;
			if(num==5) {
				break;
			}
		}
		System.out.println("----------------------------------------------------------");
		
		//2.for loop
		
		//when to use while loop--use cases
		
		/**Usecases: when we know about how many times iterations we have to perform
		 * 		ex: 1 to 10: array
		 * 		drop down list :jan to dec(1 to 12)
		 * 		calendar/date-picker
		 */
				
//		for(int k=0;k<=10;k++) {
//			System.out.println(k);
//			
//		}
////		
//		int k=0;
//		for( ;k<=10;k++) {
//			System.out.println(k);
//			
//		}
		

		int k=0;
		for( ;k<=10; ){
			System.out.println(k);
			k++;
		}
		
		System.out.println("------------------------------------------------");
		//Infinte loop in for
//		for(;;) {
//			System.out.println("Hello"); //Infinite loop--- by default for will take TRUE
//		}
//			
		System.out.println("---------------------------------------------------");
		
		//using other Primitive data types in for loop
		
//		for(double d=1.1;d<10.5;) {
//			System.out.println(d);
//			d=d+0.1;
//		}
//		
		System.out.println("-------------------------------");
		
//		for(char c='a';c<='z';c++) {
//			//System.out.println(c);
//			//System.out.println((int)c);
//			System.out.println(c+":"+(int)c);
//		}
//		
		System.out.println("------------------------------------");
//		
//		//Assignment A-Z ascii and 0 to 9
//		for(char c='A';c<='Z';c++) {
//			System.out.println("Ascii Value of A to Z:");
//			System.out.println(c+":"+(int)c);
//		}
//		System.out.println("------------------------------------");
//		
//
//		for(char c='0';c<='9';c++) {
//			System.out.println("Ascii Value of A to Z:");
//			System.out.println(c+":"+(int)c);
//		}
//		
//		System.out.println("------------------------------------");
//		

		
		//1,3,5,7,9---odd numbers		
//
//		for(int odd=1; odd<=9;odd+=2 ) {
//			System.out.println(odd);
//		}
//		
//		//num % 2==0----even
//		//num % 2==1---odd
//		
//		
//		
//		//Assignment---print even odd from 0 to 10
//		
//		for(int j=0;j<=10;j++) {
//			
//			if(j%2==0) {
//				System.out.println(j);
//			}else {
//				System.out.println(j);
//			}
//			
//		}
		
		System.out.println("-----------------------------------------------");
			
		for(int l=1;l<=100;l++) {
			System.out.println(l); //1
			if(l%5==0) {
				System.out.println("hi");
			}
		}
	
	
		System.out.println("-------------------------------------------------------");
		
		//3.do while loop
		
		int p=1;
		do {
			System.out.println(p);
			p++;
		} while (p<=10);
		
		System.out.println("---------------------------");
		
		
		
	}

}
