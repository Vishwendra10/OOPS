package oops;

public class OOPS extends Employee{
	public static void main(String[] args) {

		Employee e1= new Employee();
		e1.setEmpId(1);
		e1.setName("AA");
		e1.setEmail("abc@abc.com");
		e1.setExperience(3);
		
		//Inheritance
		e1.setAge(20);
		e1.setBloodGroup("AB+");
		e1.setAddress("Pune");
		
		//Polymorphism
		e1.printInfo(1);
//		e1.printInfo();
		
		System.out.println("Salary "+e1.calculateSalary(e1.getExperience()));
	}
}
