package pkg;

public class Student {
	int age;
	int rollno;

	public void display1() {
		System.out.println("Welcome all");
	}

	public void display2() {
		System.out.println("Automation is easy");
	}

	public static void main(String[] args) {
		Student john = new Student();
		john.age = 20;
		john.rollno = 10005;
		System.out.println("Student age is " + john.age);
		System.out.println("Student roll number is " + john.rollno);
		john.display1();
		john.display2();
	}
	

}