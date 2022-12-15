package Member;

public class Main {

	public static void main(String[] args) {
		Address add = new Address(23, "Pi 1", "Noida");
		Address add1 = new Address(25, "Delta 2", "Noida");
		Employee em = new Employee("Rahul Singh", 21, "1234567890", add, "40,000", "Web Devlopment", "Technical");
		Manager man = new Manager("Raghu", 23, "1234567890", add1, "60,000", "Human Resources", "HR");
		
		em.print();
		System.out.println();
		man.print();
		
	}

}
