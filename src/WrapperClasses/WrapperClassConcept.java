package WrapperClasses;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//String to integer
		String x="100";
		System.out.println(x+20);
		
		int i=Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y="100A";
//		//String t=y.replace('A', ""); remove A from String 100A
//		int k=Integer.parseInt(y);//NumberFormatException
//		System.out.println(k);
//		
		
		//String to Double:
		String total="120.33";
		double d=Double.parseDouble(total);
		System.out.println(d+10.33);
		
		//String to boolean
		String flag="true";
		boolean fg=Boolean.parseBoolean(flag);
		if(fg) {
			System.out.println("Run your test");
		}
		
		//Reverse logic: Int to String
		int bal=500;
		String b=String.valueOf(bal);
		System.out.println(b+30);
		
		
		//Assignment: create function to return order id
		String msg="Your order id is 12345";
		//substring():
		String orderId=msg.substring(msg.indexOf("is")+3);
		System.out.println(orderId);
		
		String m1=msg.substring(1, 11);
		System.out.println(m1);
	
		
		
		
	}

}
