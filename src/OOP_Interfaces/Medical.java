package OOP_Interfaces;

public interface Medical extends WHO {

	public void medicalFunds();
	
	public void medicalFunds(int fee);
	
	@Override
	public void vaccination();
	
}

