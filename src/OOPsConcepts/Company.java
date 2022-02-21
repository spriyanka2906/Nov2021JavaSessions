package OOPsConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	//WAF:
	//nem:getCompanyInfo
	//input:param: compName(String)
	//return: name,Bangalore, 1000,5.5, Tom ------Object static array

	public Object[] getCompanyInfo(String compName) {
		
		System.out.println("Getting info for: "+ compName);
		
		Object info[]=new Object[5];
		
		if(compName.equals("IBM")) {
			info[0]="IBM";
			info[1]=1000;
			info[2]=5.5;
			info[3]="Bangalore";
			info[4]="Tom";
		} else 
			if(compName.equals("Microsoft")) {
				info[0]="Microsoft";
				info[1]=2000;
				info[2]=6.5;
				info[3]="Hyderabad";
				info[4]="Peter";
		} else {
			System.out.println("Company name");
		}
		return info;
	}
	
	//dynamic array object list
	//name: getProductList(String)
	//return: list of products
	public ArrayList<String> getProductList(String compName) {
		
		System.out.println("Getting product list for:" + compName);
		
		ArrayList<String> prodList=new ArrayList<String>();
		
		
		switch (compName.toLowerCase()) {
		case "amazon":
			prodList.add("Macbook");
			prodList.add("Samsung");
			prodList.add("iMac");
			break;
		case "walmart":
			prodList.add("nike");
			prodList.add("reebok");
			prodList.add("adidas");
			break;	
		case "flipkart":
			prodList.add("zara");
			prodList.add("H&M");
			prodList.add("H&B");
				break;
		default:
			System.out.println("Company not found....." + compName);
			break;
		}
	return prodList;
	}
	
	
	public static void main(String[] args) {
		
		Company obj=new Company();	
		//String n=obj.getCompanyInfo("IBM");
		//System.out.println(n);
		
		Object[] comp=obj.getCompanyInfo("IBM");
		System.out.println(Arrays.toString(comp));
		
		Object[] comp1=obj.getCompanyInfo("Naveen Automation Labs");
		System.out.println(Arrays.toString(comp1));
		
		ArrayList<String> amzList=obj.getProductList("amazon");
		System.out.println(amzList);// write for /for each for practice to print arraylist
		System.out.println("Amazon Product count: "+amzList.size());
		
		ArrayList<String> wamList=obj.getProductList("walmart");
		System.out.println(wamList);
		System.out.println("Walmart Product count: "+wamList.size());
		
		ArrayList<String> snpdList=obj.getProductList("snapdeal");
		System.out.println(snpdList);
		System.out.println("SnapDeal Product count: "+snpdList.size());
	}

}
