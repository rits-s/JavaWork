package pkg;

public class ParameterisedConstructorNew {
	public ParameterisedConstructorNew() {
		this(10,20,30);
		System.out.println("I am default constructor");
	}

	public ParameterisedConstructorNew(int a) {
		this(10,20);
		System.out.println("I am 1 parametrised contructor");
	}

	public ParameterisedConstructorNew(int a, int b) {
		this(10, 20, 30, 40);
		System.out.println("I am 2 parametrised contructor");
	}

	public ParameterisedConstructorNew(int a, int b, int c) {
		
		System.out.println("I am 3 parametrised constructor");
	}

	public ParameterisedConstructorNew(int a, int b, int c, int d) {
		this();
		System.out.println("I am  4 parametrised constructor");
	}

	public static void main(String[] args) {
		ParameterisedConstructorNew c = new ParameterisedConstructorNew(10);
	}

}
