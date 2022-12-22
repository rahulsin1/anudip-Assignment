package person;

public class StudentMain {

	public static void main(String[] args) {
		String[] s1 = new String[5];
		s1[0] = "Database Management System";
		s1[1] =	"Operating System";
		s1[2] = "Microprocessor";
		s1[3] =	"Math";
		s1[4] = "Software Engineering";
		Student stu1 = new Student("rahul", 23, "9639xxx", "386", s1);
		Student stu2 = new Student("deve", 20, "3577xxx2", "307", s1);
		
		System.out.println(stu1);
		System.out.println();
		System.out.println(stu2);
	}

}
