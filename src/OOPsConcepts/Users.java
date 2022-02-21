package OOPsConcepts;

public class Users {

	
	//methods--piece of code and can be reusable ----class data member
	//methods should be parallel to each other
	//method can not be created inside a method
	//can not create a duplicate method--but can be over;oaded


	//1. no input and no return
		//void--- cannot return any value
		//return type: void
	
	//void and return cannot be written together
	public void test() {
		System.out.println("Test Method......");
		
	}
	
	//2. no input and some return
		//return something
	public int getNumber() {
		System.out.println("Get number method .......");
		return 100;
	}
	
	public String getTrainerName() {
		System.out.println("Get trainer name  method .......");
		String name="Naveen AutomationLabs";
		return name;
		//return "Naveen";
	}
	
	public boolean isForgotPwdLinkExist() {
		System.out.println("Checking forgot password link");
		return true;
	}
	
	//3. some input and some return: //Parameters
	public int add(int a, int b) {
		
		System.out.println("Add Method");
		int c=a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		Users obj=new Users();
		obj.test();
		System.out.println("--------------");
		int num=obj.getNumber();
		System.out.println(num);
		obj.getTrainerName();
		
		boolean flag=obj.isForgotPwdLinkExist(); //flag is holding parameter variable
		
		System.out.println(obj.isForgotPwdLinkExist()); //not a best practise
		if(flag) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		int sum=obj.add(10,20);
		System.out.println(sum+(5/100));
		
		int s=obj.add(30, 40);//argument
		System.out.println(s+40);
	}

}
