package OOP_Interfaces;

public class TestHospital {

	public static void main(String[] args) {
		
		final int i=10; // Constant variables
//		i=20;
//		i=30;
		System.out.println(i);
		
		int days=7;
		System.out.println(days*100);
		
		
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		
		fh.medicalFunds();
		fh.covidReport("OMICRON");
		fh.medicalFunds(100);
		
		
		System.out.println(USMedical.main_fee);
		USMedical.billing();
		System.out.println(FortisHospital.main_fee);
		
		//We cannot create object of Interface
			//USMedical us=new USMedical();
		System.out.println("----------------------------");
		
		//TopCasting:
		//Child class object can be referred by parent interface reference variable
		USMedical us=new FortisHospital();
		us.cardioServices();
		us.physioServices();
		us.oncologyServices();
		us.emergencyServices();
		
		System.out.println("----------------------------");
		//Reference type check failure---- individual methods from FortisHospital
			//us.medicalInsurance();
			//us.medicalTraining();
		
		UKMedical uk=new FortisHospital();
		uk.radioServices();
		uk.entServices();
		uk.emergencyServices();
		
		System.out.println("----------------------------");
		
		IndianMedics ind=new FortisHospital();
		ind.dentalServices();
		ind.pediaServices();
		ind.emergencyServices();
		
		
		//DownCasting
		//FortisHospital f1=new USMedical();

	}

}
