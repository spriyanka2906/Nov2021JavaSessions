package constructorConcepts;

import java.util.ArrayList;

class Company {

	String name;
	int empCount;
	ArrayList<String> catList;
	boolean isFunded;
	double sharePrice;
	
	
	public void getCompanyInfo() {
		
		System.out.println("Getting Company info...............");
	}
	
	public String getCompanyPlans() {
		System.out.println("Getting Company plans.............");
		return " 2022 ";
	}
	
	public Company(String name) {
		this.name=name;
	}
	
	public Company(String name,int empCount) {
		this.name=name;
		this.empCount=empCount;
	}
	
	public Company(String name,int empCount,ArrayList<String> catList) {
		this.name=name;
		this.empCount=empCount;
		this.catList=catList;
	}
	
	public Company(String name,int empCount,ArrayList<String> catList,boolean isFunded,double sharePrice) {
		this.name=name;
		this.empCount=empCount;
		this.catList=catList;
		this.isFunded=isFunded;
		this.sharePrice=sharePrice;
	}
	
	
	
	
}
