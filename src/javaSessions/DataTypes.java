package javaSessions;

/*
 *This class ia about Data Types in JAva 
 */

public class DataTypes {

	public static void main(String[] args) {
		
		//Non-Primitive--: String, Class, Arrays, Objects
		
		
		
		//Primitive data types
		
		//Numeric---Integral----Integer
		//1.Byte(size and range)
			//1.Size: 1 byte=8 bits
			//2. Range: -128 to 127
		
		byte b=10;
		b=20;
		b=30;
		byte b1=-20;
		byte b3=0;
		//byte b2=130; // Out of range
		byte b4=40;
		
		
		System.out.println(b);
		System.out.println(b1+b4);
		
		
		
		//2. short
		//size: 1byte=16 bits
		//range: -32768 to 32767
		
		short s1=1234;
		short s2=1;
		
		//3. int:
		//size: 4 bytes=32 bits
		//range: -2147483648 to -2147483647
		
		int i=100000;
		int j=1;
		
		//4. long:
			//size: 8 bytes=64 bits
			//range:
		
		long distance=12364736338L;
		System.out.println(distance);

		
		//Numeric---Integral---Floating
			//1. float:
				//size: 4 bytes=32 bits
				//range: after decimal , it can take upto 7 digits
		
		float f1=12.32f;
		System.out.println(f1);
		float f2=100;
		System.out.println(f2);
		
		//2. float:
		//size: 8 bytes=64 bits
		//range: after decimal , it can take upto 15 digits
		
		double d1=12.33333;
		System.out.println(d1);
		
		
		//Characters---char
		//1. char
		//size: 2 bytes=16bits
		
		char ch='a';
		char h='b';
		char c1='1';
		char c2='$';
		
		System.out.println(ch);// output: a
		System.out.println(ch+h);// output : 195
		System.out.println((int)ch);// output: 97
		
		
		
		//Boolean
			//size: ~1 bit
		
		boolean flag=true;
		
		System.out.println(flag);
		
	}

}
