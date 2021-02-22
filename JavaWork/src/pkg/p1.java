package pkg;
//c1 is the child constructor
public class p1 {
	public p1() {
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public p1(int a) {
		this();
		System.out.println("Parent 1 Parameterised Constructor");
	}
	public p1(int a, int b) {
		this(1);
		System.out.println("Parent 2 Parameterised Constructor");
	}
	public p1(int a, int b, int c) {
		System.out.println("Parent 3 Parameterised Constructor");
	}
	
}
