package oops;

//Encapsulation
//Inheritance(multiple Inheritance)
public class Employee extends PersonalInfo implements CalculateSalaryClass{
	
	//Encapsulation
	private int empId;
	private String name;
	private String email;
	private int experience;
	
	Employee() {}
	
	Employee(int empId, String name, int experience, String email){
		this.empId=empId;
		this.name=name;
		this.email=email;
		this.experience=experience;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
	//Polymorphism
	public void printInfo(int empId) {
		System.out.println("EmpId "+empId);
		System.out.println("Name "+this.name);
		System.out.println("Email "+this.email);
		System.out.println("Experience "+this.experience);
	}
	
	public void printInfo() {
		System.out.println("EmpId "+this.empId);
		System.out.println("Name "+this.name);
		System.out.println("Email "+this.email);
		System.out.println("Experience "+this.experience);
		printPersonalInfo();
	}

	//Abstraction
	public int calculateSalary(int experience) {
		return this.experience*10000;
	}
	
}
