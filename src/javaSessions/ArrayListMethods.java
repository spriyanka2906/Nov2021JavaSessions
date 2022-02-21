package javaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Tom");
		empList.add("Naveen");
		empList.add("Haroon");
		empList.add("Keshav");
		
		System.out.println(empList);
		
		
		//sort
		Collections.sort(empList);
		System.out.println(empList);
		
		Collections.sort(empList,Collections.reverseOrder());
		System.out.println(empList);
		
		System.out.println("-------------------------------------");
		
		ArrayList<String> stList=new ArrayList<String>();
		stList.add("Tom");//0
		stList.add("Harshini");//1
		stList.add("Divya");//2
		stList.add("Pradeep");//3
		
		for(int i=stList.size()-1;i>=0;i--) {
			
			System.out.println(stList.get(i));
		}
		
		System.out.println("-------------------------------------");
		
		ArrayList<String> trList=new ArrayList<String>();
		trList.add("Lisa");//0
		trList.add("Peter");//1
		trList.add("Naveen");//2
		
		trList.addAll(stList);
		System.out.println(trList);
		
		System.out.println("-------------------------------------");
		
		//
		ArrayList<Integer> ar=new ArrayList<Integer>();
		List<Integer> data=Arrays.asList(10,20,30);
		
		System.out.println(data);
		
		List<String> names=Arrays.asList("AA","AAA","AAAA");	
		System.out.println(names);
		
		int d[]=new int[3]; //new keyword
		d[0]=10;
		d[1]=30;
		d[2]=50;
		System.out.println(d);
		
		int dd[]= {1,2,3,4,5,4,5,7}; //int Literal array
		
		int ddd[]=new int[] {10,20,30};//new +literals
		//System.out.println(ddd[3]);//IndexOutOfBoundsExceptions
		System.out.println(ddd.length);
		
		String str="hello"; //String Literal
		String s1=new String("hello"); //String Object
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
