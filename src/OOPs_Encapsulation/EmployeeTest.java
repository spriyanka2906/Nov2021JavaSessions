package OOPs_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setName("Tom");
		e1.setAge(20);
		e1.setSalary(12.33);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		e1.setInfo("Ravi", 23, 34.33);
		System.out.println(e1.getInfo());
		
	}

}
