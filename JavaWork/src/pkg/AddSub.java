package pkg;

public class AddSub {
	int a;
	int b;

	public int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public int subtract(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	public int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		AddSub total = new AddSub();
		int p = total.sum(10, 2);
		int q = total.sum(p, 2);
		int r = total.subtract(q, 2);
		int s = total.multiply(r, 2);
		int t = total.divide(s, 2);

		int d = total.subtract(10, 2);
		int e = total.multiply(d, 2);
		int f = total.subtract(e, 2);
		int g = total.sum(f, 2);
		int h = total.divide(g, 2);

		System.out.println("The answer for Assignment1 ((((10+2)+2)-2)*2)/2 is  " + t);
		System.out.println("The answer for Assignment2 ((((10-2)*2)-2)+2/2) is  " + h);
	}

}
