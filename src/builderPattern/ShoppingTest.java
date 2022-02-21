package builderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		
		EcommApp e1=new EcommApp();
		//UC1
		int id=e1.login("naveen@gmail.com","test123")
			.search("imac")
			.addToCart("imac")
			.doPayment("1234 4321", 325)
			.genaerateOrder()
			.sendOrderViaEmail()
			.logout()
			.getOderID();
		System.out.println(id);
		
		//UC2
		e1.login()
			.search("nike shoes")
			.logout();
		
		//UC3
		e1.login("admin", "admin123")
			.logout();
		
		//UC4
		e1.login()
			.search("macbook pro")
			.addToCart("macbook pro")
			.search("ipad")
			.addToCart("ipad")
			.search("apple pencil")
			.doPayment("naveen@hdfc")
			.genaerateOrder()
			.sendOrderViaEmail()
			.logout();
		
		//UC5
		e1.login().logout();
		
		//UC6
		e1.logout();
		
		
		EcommApp e2=new EcommApp();
		
		
		
		
		
		
	}

}
