package pkg;

public class Parent {
	public Parent() {
		
		System.out.println("I am parent default constructor");
	}
	public Parent(int a) {
		this(10,20,30,40);
		System.out.println("I am parent 1 parametrised contructor");
	}
	public Parent(int a, int b) {
		this(10);
		System.out.println("I am parent 2 parametrised contructor");
	}
	public Parent(int a, int b, int c) {
		this(10,20);
		System.out.println("I am parent 3 parametrised constructor");
	}
	public Parent(int a, int b, int c, int d) {
		this();
		System.out.println("I am parent 4 parametrised constructor");
		
	}
}