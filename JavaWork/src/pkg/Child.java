package pkg;

public class Child extends Parent{
	public Child() {
		this(10,20,30);
		System.out.println("I am child default constructor");
	}

	public Child(int v) {
		super(10,20,30);
		System.out.println("I am child 1 parametrised constructor");
	}

	public Child(int v, int x) {
		this(10,20,30,40);
		System.out.println("I am child 2 parameterised constructor");
	}

	public Child(int v, int x, int y) {
		this(10);
		System.out.println("I am child 3 parameterised constructor");
	}
	public Child(int v, int x, int y, int z) {
		this();
		System.out.println("I am child 4 parameterised constructor");
	}

	public static void main(String[] args) {
		Child c = new Child(10,20);
		
	}
}
