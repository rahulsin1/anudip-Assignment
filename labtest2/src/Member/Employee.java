package Member;

public class Employee extends Member {
	String specialization;
	String department;
	
	Employee(String name, int age, String phonenum, Address add, String salary, String specialization, String department){
		super(name, age,phonenum, add, salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	public void print() {
		System.out.println("Name: " + super.name);
		System.out.println("Age: " + super.age);
		System.out.println("Phone Number: " + super.phoneNum);
		System.out.println("Address: " + super.add.hno + ", " + super.add.locality + ", " + super.add.city);
		System.out.println("Specialization: " + specialization);
		System.out.println("Department: " + department);
		super.printsalary();
	}
}