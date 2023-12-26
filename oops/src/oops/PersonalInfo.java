package oops;

public class PersonalInfo {
	private int age;
	private String bloodGroup;
	private String address;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printPersonalInfo(){
		System.out.println("Age "+this.age);
		System.out.println("BloodGroup "+this.bloodGroup);
		System.out.println("Address "+this.address);
	}
}
