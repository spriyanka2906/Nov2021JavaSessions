package OOPsConcepts;

public class Student {

	//WAF-Write a function
	//name: getStudentMarks
	//input param: name(String)
	//return: marks(int)
	
	public int getStudentsMarks(String studentName) {
		System.out.println("Getting marks for Student:"+ studentName);
		int marks=-1;
		
		if(studentName.equals("Sameer")) {
			marks=90;
		}
		else if(studentName.equals("Harshini")){
			marks= 95;
		}
		else if(studentName.equals("Ram")) {
			marks= 100;
		}
		else if(studentName.equals("Naveen")) {
			marks= 10;
		}
		else {
			System.out.println("Please pass the correct student name................");
			//return -1; //Prgmming standard if no value is return from int return type we need to return -1
		}
		return marks;
	}
	

	
	
	public static void main(String[] args) {
		
		Student st=new Student();
		int m=st.getStudentsMarks("Sameer");
		System.out.println(m+5-3);
		
		m=st.getStudentsMarks("Sri");
		System.out.println(m);
		if(m==-1) {
			System.out.println("Dont generate the mark sheet");
		}
	}

}
