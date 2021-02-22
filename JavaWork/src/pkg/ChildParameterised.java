package pkg;
//     ParentParameterised is the parent
public class ChildParameterised extends ParentParameterised {
	public ChildParameterised() {
		this(10,20,30);
		System.out.println("I am child default constructor");
	}

	public ChildParameterised(int v) {
		super(10,20,30);
		System.out.println("I am child 1 parametrised constructor");
	}

	public ChildParameterised(int v, int x) {
		this(10,20,30,40);
		System.out.println("I am child 2 parameterised constructor");
	}

	public ChildParameterised(int v, int x, int y) {
		this(10);
		System.out.println("I am child 3 parameterised constructor");
	}
	public ChildParameterised(int v, int x, int y, int z) {
		this();
		System.out.println("I am child 4 parameterised constructor");
	}

	public static void main(String[] args) {
		ChildParameterised c = new ChildParameterised(10,20);
		
	}
}
