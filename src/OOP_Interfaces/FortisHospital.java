package OOP_Interfaces;

public class FortisHospital extends UNHG implements USMedical , UKMedical, IndianMedics ,WHO{

	//USMedical
	@Override
	public void physioServices() {
		System.out.println("FH------physioServices");		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH------cardioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH------oniologyServices");		
	}
	
	
	//UKMedical
	@Override
	public void radioServices() {
		System.out.println("FH------radioServices");	
	}

	@Override
	public void entServices() {
		System.out.println("FH----- entServices");		
	}

	//IndianMedical

	@Override
	public void dentalServices() {
		System.out.println("FH----- dentalServices");		
	}

	@Override
	public void pediaServices() {
	System.out.println("FH-----pediaServices");
		
	}
	//common method
	@Override
	public void emergencyServices() {
		System.out.println("FH----- emergencyServices");	
	}

	//Individual methods:
	public void medicalTraining() {
		System.out.println("FH----Medical training");
	}
	
	public void medicalInsurance() {
		System.out.println("FH----Medical Insurance");
	}
	
	
	
	
	
	
	//Medical
	@Override
	public void medicalFunds() {
		
		System.out.println("FH----- Medical funds");
	}

	@Override
	public void medicalFunds(int fee) {
		System.out.println("FH----- Medical funds"+fee);
	}
	//WHO
	@Override
	public void covidTest() {
		System.out.println("FH----- Covid test");
		
	}

	@Override
	public void vaccination() {
		System.out.println("FH----- vaccination");		
		
	}

	@Override
	public void covidReport(String version) {
		System.out.println("FH----- Virus version" + version);
		
	}

	//Method Hiding---- cannot override static method
	public static void billing() {
		System.out.println("USMedical---billing");
	}
	
	@Override
	public void opdServices() {
		System.out.println("US medical-----OPt");
	}

	
	
}
