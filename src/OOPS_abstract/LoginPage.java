package OOPS_abstract;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LoginPage----default constructor....");
	}
	
	public LoginPage(int i) {
		System.out.println("LoginPage----one param constructor...."+i);
	}
	
	@Override
	public void title() {
		System.out.println("LP===Title");	
	}

	@Override
	public void url() {
		System.out.println("LP-----url");		
	}
	
	public void doLogin(String un, String pwd ) {
		System.out.println("Page ----login "+un+" : "+pwd);
	}
	
	public void forgotpwd() {
		System.out.println("LoginPage----Forgot Pwd");
	}
	
	@Override
	public void loading() {
		System.out.println("LoginPage---loading.....in 10 secs");
	}

	@Override
	public void javascriptLoading() {
		System.out.println("LP----JavascriptLoading");
		
	}
	

}
