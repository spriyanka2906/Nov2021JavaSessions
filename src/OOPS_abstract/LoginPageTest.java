package OOPS_abstract;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage(10);
		lp.title();
		lp.url();
		lp.doLogin("admin","admin123");
		lp.forgotpwd();
		lp.calculatePrice();
		Page.logo();
		lp.loading();
		lp.javascriptLoading();

		//Page pg=new Page(); // cannot create object
		
		//top casting:
		Page p=new LoginPage();
		p.url();
		p.title();
		p.calculatePrice();
		p.doLogin("admin","admin123");
		//p.forgotpwd();//reference Type cast failure
		
		//Down casting
		
		
		
		
	}

}
