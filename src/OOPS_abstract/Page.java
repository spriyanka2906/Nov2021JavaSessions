package OOPS_abstract;

public abstract class Page extends WebPage  implements W3C{

	//0 to 100% abstraction
		//0%-->no abstract methods
		//100%-->only abstract method: no body
		//partial abstraction
		//can not create objects f abstract classes
		//can create constructor of abstract class------important
		//it will be invoked when you create the object of child class
	
	public Page() {
		System.out.println("Page---default constructor.....");
	}
	
	public Page(int i) {
		System.out.println("Page---one param constructor....."+i);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void doLogin(String un, String pwd ) {
		System.out.println("Page login");
	}
	
	public static void logo() {
		System.out.println("Page----- logo");
	}
	
	public final void calculatePrice() {
		System.out.println("Page---- calculate price");
	}
	
	@Override
	public void loading() {	
	System.out.println("Page----Loading");
	}

	@Override
	public void javascriptLoading() {
		System.out.println("LP-----");
	}
	
	
}
