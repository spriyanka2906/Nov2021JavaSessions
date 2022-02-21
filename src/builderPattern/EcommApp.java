package builderPattern;

public class EcommApp {

	private int orderID;
	
	public EcommApp login() {
		System.out.println("Login to app");
		return this;
	}
	
	public EcommApp login(String un, String pw) {
		System.out.println("Login to app:"+un+":"+pw);
		return this;
	}
	public EcommApp search(String productName) {
	System.out.println("Searching the product:"+productName);
	return this;
	}
	public EcommApp search(String productName, int price) {
		System.out.println("Searching the product:"+productName +":"+price);
		return this;
	}
	public EcommApp clickOnProduct(String productName) {
		System.out.println("Click on the product:"+productName);
		return this;
	}
	
	public EcommApp addToCart(String productName) {
		System.out.println("Add to cart"+productName);
		return this;
	}
	
	public EcommApp doPayment(String cc,int cvv,int otp) {
		System.out.println("do Payment:"+cc+":"+cvv+":"+otp);
		return this;
	}
	
	
	public EcommApp doPayment(String cc,int otp) {
		System.out.println("Do payment"+cc+":"+otp);
		return this;
	}
	
	public EcommApp doPayment(String upi) {
		System.out.println("do payment:"+upi);
		return this;
	}
	
	public int getOderID() {
		return this.orderID;
		
	}
	public EcommApp genaerateOrder() {
		System.out.println("Generate order"+12345);
		this.orderID=12345;
		return this;
	}
	
	public EcommApp sendOrderViaEmail() {
		System.out.println("Send an email for Order");
		return this;
	}
	public EcommApp logout() {
		System.out.println("Logout app");
		return this;
	}
	
	
	
}
