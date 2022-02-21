package Finalizemethod;

public class Company {

	String cName;
	
	@Override
	public void finalize() {
		System.out.println("Inside finalize method....Company");
	}

	/**Practical use case:
	 * 
	 * 1.finally block:  DB connection:
	 * 		make DB connection --- Connected
	 * 		hit sql query --- Exception
	 * 		get the result from DB ---Exception
	 * 	
	 * 		finally{
	 * 				Close the dB connection
	 * 		}
	 * 	2. finalize():
	 * 		Launch a browser
	 * 		Fill the form on Login page
	 * 		driver=null
	 * 		finalize(){
	 * 			Clean up activity
	 * 			re-initialize the driver
	 * 			driver.quit()
	 * 			shut down the Selenium server
	 * 		}	
	 * 
	 * 
	 * 
	 */
	
	
	
}
