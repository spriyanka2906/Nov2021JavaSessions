package StringManipulations;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str="Hello this is my java code i am so happy";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));//H
		
		System.out.println(str.charAt(25));
		
		System.out.println(str.charAt(str.length()-1));

		//System.out.println(str.charAt(26)); //StringIndexOutOfBoundsException
		
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('i'));//capturing 1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));// 2nd occurrence of i
		
		System.out.println(str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1));//3rd occurrence of i
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("world"));
		
		String mesg="Hello null";
		if(mesg.indexOf("Naveen")!=-1) {
			System.out.println("Message is correct");
		}else {
			System.out.println("Message incorrect");
		}
		
		
		//Change case
		
		String test="Welcome to java";
		System.out.println(test.toLowerCase());
		System.out.println(test.toUpperCase());
		
		//String comparison
			//String Literals
		String s1="Hello World";
		String s2="Hello World";
		System.out.println(s1==s2);
		
		//String Objects---Optimization is done  automatically in java for Strings
		String s3=new String("Hello Java");// created 2 objs-- one in heap and one in SCP-String const pool
		String s4=new String("Hello Java");//created 1 objs--- one in heap as Hello Java is already available in SCPand it cannot have duplicate entries
		String s5="Hello Java"; // 0 objects--- Hello JAva is already there in SCP
		
		System.out.println(s3==s5);//comparing the references for String----as s3 is in Heap and s5 is in SCP---both pointing to different objects
		System.out.println(s3.equals(s5));//comparing the values
		
		String s6="Hello World";//0 objects
		
		String s7="Hello Python";
		s7="Hello JS";//1 entry
		System.out.println(s7);
//		
	s4=null;
//		//System.out.println(s4.equals(s5));//NullPointerException
//		System.out.println(s5.equals(s4));
		System.out.println("----");
		

//		if(s4.equals(s5)) {
//			System.out.println("PASSSSS"); //NPE
//		}else {
//			System.out.println("FAILLLLL");
//		}
//		
		//to avoid NPE--- best practice
		if(s5.equals(s4)) {
			System.out.println("PASSSSS");
		}else {
			System.out.println("FAILLLLL");
		}
		System.out.println("------");
		//equals:
		String t1="hello world";
		String t2="hello World  ";
		
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equalsIgnoreCase(t2.trim()));//true--- one to one matching
		
		System.out.println("---");
		
		//contains:
		System.out.println(t1.contains("hello"));
		System.out.println(t1.contains("Hello"));
		
		System.out.println("---");
		
		//trim:
		String top="    hello     testing     ";	
		//System.out.println(top.trim());
		System.out.println(top.replace(" ", ""));
		
		//replace: to remove extra spaces between two words
		String tt="hello world";
		System.out.println(tt.replace(" ", ""));
		
		String dob="01-01-1990";//01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//split
		String lang="JAVA_PYTHON_JS_RUBY";
		String lg[]=lang.split("_");
		System.out.println(lg.length);
		System.out.println(lg[0]);
		
		String pop="xXtestingxxXseleniumXxXQTPXXxXCypress";
		String p[]=pop.split("xX");
		System.out.println("-----");
		System.out.println(p[0]);//Empty
		System.out.println("-----");
		System.out.println(p[1]);//	testingx
		System.out.println(p[2]);//seleniumX
		System.out.println(p[3]);//QTPXX
		System.out.println(p[4]);//Cypress
		
		//System.out.println(p[5]);//AIOB
		System.out.println("-----");
		
		//Use in Selenium
		String empData="Devesh;Kumar;pune;India;SDET2;IBM";
		
		//System.out.println(empData.split(";")[0]);
		String emp[]=empData.split(";");
		for(String e: emp) {
			System.out.println(e);
		}
	
		//Reverse String
		String s11="Selenium";
		
		
	
		
		
	}

}
