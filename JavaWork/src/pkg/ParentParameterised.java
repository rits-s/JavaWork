package pkg;
//      ChildParameterised is the child
public class ParentParameterised {
	public ParentParameterised() {
		
		System.out.println("I am parent default constructor");
	}
	public ParentParameterised(int a) {
		this(10,20,30,40);
		System.out.println("I am parent 1 parametrised contructor");
	}
	public ParentParameterised(int a, int b) {
		this(10);
		System.out.println("I am parent 2 parametrised contructor");
	}
	public ParentParameterised(int a, int b, int c) {
		this(10,20);
		System.out.println("I am parent 3 parametrised constructor");
	}
	public ParentParameterised(int a, int b, int c, int d) {
		this();
		System.out.println("I am parent 4 parametrised constructor");
		
	}
}
