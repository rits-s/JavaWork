package pkg;
//p1 is the parent constructor
public class c1 extends p1 {
	public c1() {
		super(1,2);
		System.out.println("Child Default Constructor");
	}
	public c1(int a) {
		this(1,2,3);
		System.out.println("Child 1 Parameterised Constructor");
	}
	public c1(int a, int b) {
		this(1);
		System.out.println("Child 2 Parameterised Constructor");
	}
	public c1(int a, int b, int c) {
		this();
		System.out.println("Child 3 Parameterised Constructor");
	}
	public static void main(String[] args) {
		c1 c = new c1(1,2);
	}
}
