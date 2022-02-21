package javaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Collection
		 * ArrayList--default c;ass
		 * dynamic array
		 *
		 */
		
		//Object if ArrayList
		ArrayList arr=new ArrayList(); //By default Virtual capacity is 10
		System.out.println(arr.size());
		
		arr.add(100);//0
		arr.add(200);//1
		
		System.out.println(arr.size());
		
		arr.add("tom");//2
		arr.add('m');//3
		System.out.println(arr.size());
		
		//li=0
		//hi=3
		//len/size=hi+1=4
		
		arr.add(300);//4
		System.out.println(arr.size());
		
		System.out.println(arr.get(0));
		//System.out.println(arr.get(-1));//IndexOutOfBoundsException
		//System.out.println(arr.get(5));//IndexOutOfBoundsException
		System.out.println("----------------------------------");
		
		ArrayList a1=new ArrayList(20); //VC=20
		ArrayList a2=new ArrayList(5); //VC=5
		
		a2.add(100);
		a2.add(100);
		a2.add(null);
		a2.add(null);
		
		
		System.out.println(a2.size());
		System.out.println(a2.get(1));
		System.out.println(a2.get(2));
		System.out.println(a2.get(3));
		a2.add(4, 200);
		//a2.add(9,1000); //IndexOutOfBoundsException
		
		
		System.out.println(a2.get(4));
		// System.out.println(a2.get(5)); //IndexOutOfBoundsException
		
		a2.add(3,1100);
		System.out.println(a2.get(3));
		
		ArrayList prod=new ArrayList();
		
		prod.add('A');
		prod.add('B');
		prod.add('C');
		prod.add('D');
		prod.add('E');
		
		System.out.println("-------------------------------------------");
		System.out.println(prod.size());//5
		System.out.println(prod.get(3));//D
		prod.remove(3);
		System.out.println(prod.size());//4
		System.out.println(prod.get(3));//E
		
		
		//int ArrayList: Generics
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		//marks.add("int");//Restricted to stored only integer values 
		
		ArrayList<Double> sal=new ArrayList<Double>();
		
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Tom");
		empList.add("Naveen");
		empList.add("Naveen");
		empList.add("Naveen");
		empList.add("Naveen");
		
		System.out.println(empList);
		
		for(String e: empList) {
			System.out.println(e);
		}	

		System.out.println("-------------------------------------------");
		
		//name,age,gender,sal,boolean
		//Object ArrayList
		ArrayList<Object> empData=new ArrayList<Object>();
		
		empData.add("Tom");//0
		empData.add(30);//1
		empData.add('m');//2
		empData.add(12.33);//3
		empData.add(true);//4
		
		//Iterate the values in ArrayList--Fetch the value
		for(int i=0;i<empData.size();i++) {
		System.out.println(empData.get(i));	
		}
		

		System.out.println("-------------------------------------------");
		
		//for each:
		for(Object e:empData) {
			System.out.println(e);
				if(e.equals('m')) {
					System.out.println("Male employee");
			}
		}

		System.out.println("-------------------------------------------");
		
		System.out.println(empData);
		
		System.out.println("-------------");
		
		  
		
		
		
	}

}
