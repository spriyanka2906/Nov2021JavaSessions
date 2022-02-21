package javaSessions;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		
		
		int i=0;
		i=20;
		i=30;
		
		//Array: 
		//used to store multiple similar type of data/values
		
		/**Limitations:
		 * 1. Size is fixed and static: to overcome this-->we need to use dynamic array
		 * 2. It stores only similar types of data: to overcome this--> we use Object static array
		 * 
		 * 
		 */
		
		
		
		//1.int Array
		int a[]= new int[4];
		//Li=0
		//len=4
		//Hi=3
		//len=Hi+1-->4
		//Hi=Li-1-->3
		
		
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		//a[4]=50;//ArrayIndexOutOfBoundsException
		
		System.out.println(a[0]);
		System.out.println(a[2]);
		//System.out.println(a[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(a[-1]); //ArrayIndexOutOfBoundsException--> Negative indexing is not allowed
		
		System.out.println((a[0]+a[2]));
		System.out.println("----------------------------------------------------------------");
		//to print all the values of array: for loop
		
		for (int j=0; j<a.length; j++) {
			System.out.println(a[j]); // 10 20 30 40
		}
		
		System.out.println("-------------------------------------------------------------------");
		//for each loop: enhanced loop
		for(int e : a) {
			System.out.println(e);
			
		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(a);//o/p: [I@15db9742--- Hashcode memory address
		
		System.out.println(Arrays.toString(a)); // o/p: [10, 20, 30, 40]

		
		//2.double array:
		
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=23.44;
		
		for(double e:d) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(d));
		
		//3.char array
		
		char c[]=new char[3];
		c[0]='a';
		c[1]='b';
		c[2]='1';
		System.out.println(c[0]+c[1]);
		System.out.println("----------------------------------------------");
		
		
		//4. String array
		
		String emp[]=new String[3];
		emp[0]="Mahesh";
		emp[1]="Archie";
		emp[2]="Kabir";
		
		for(String e : emp) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(emp));
		
		System.out.println("-------------------------------------------------");
		//5.Object Array: -->static(super class in java of all class)
		
		Object st[]=new Object[5];
		
		st[0]="Harshini";
		st[1]=30;
		st[2]=35.55;
		st[3]='f';
		st[4]=true;
		
		for(Object e: st) {
			System.out.println(e);
		}
		System.out.println("-------------");
		System.out.println(Arrays.toString(st));
		
		
		Object st1[]=new Object[5];
		
		st1[0]="Asha";
		st1[1]=34;
		st1[2]=39.55;
		st1[3]='f';
		st1[4]=false;
		
		for(Object e: st1) {
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(st1));
		
		
		/**
		 * Default values:
		 * int=o
		 * double=0.0
		 * boolean=false
		 * char=space
		 * String=null
		 *  
		 * 	
		 */
			
			
			
			
			
			
		
	
		
		
		
	}
	
	
	
}
