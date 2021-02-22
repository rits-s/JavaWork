package pkg;

//Assignment solve using scanner class (((((x1+x2)-x3)+x4)*x5)/x6);
import java.util.Scanner;

public class ScannerAssignment {
	public float sum(float p1, float p2) {
		float sum = p1 + p2;
		return sum;
	}

	public float sub(float p1, float p2) {
		float sub = p1 - p2;
		return sub;
	}

	public float multiply(float p1, float p2) {
		float multiply = p1 * p2;
		return multiply;
	}

	public float divide(float p1, float p2) {
		float divide = p1 / p2;
		return divide;
	}

	public static void main(String[] args) {
		System.out.println("Please provide the input for x1");
		Scanner s1 = new Scanner(System.in);
		float p1 = s1.nextFloat();
		System.out.println("Please provide the input for  x2");
		Scanner s2 = new Scanner(System.in);
		float p2 = s2.nextFloat();
		System.out.println("Please provide the input for x3");
		Scanner s3 = new Scanner(System.in);
		float p3 = s3.nextFloat();
		System.out.println("Please provide the input for x4");
		Scanner s4 = new Scanner(System.in);
		float p4 = s4.nextFloat();
		System.out.println("Please provide the input for x5");
		Scanner s5 = new Scanner(System.in);
		float p5 = s5.nextFloat();
		System.out.println("Please provide the input for x6");
		Scanner s6 = new Scanner(System.in);
		float p6 = s6.nextFloat();

		ScannerAssignment sa1 = new ScannerAssignment();
		float sum1 = sa1.sum(p1, p2);
		float sub1 = sa1.sub(sum1, p3);
		float sum2 = sa1.sum(sub1, p4);
		float m1 = sa1.multiply(sum2, p5);
		float result1 = sa1.divide(m1, p6);
		System.out.println("The result for (((((x1+x2)-x3)+x4)*x5)/x6) = " + result1);

		ScannerAssignment sa2 = new ScannerAssignment();
		float m5 = sa2.multiply(p1, p2);
		float sum5 = sa2.sum(m5, p3);
		float sum6 = sa2.sum(sum5, p4);
		float sub5 = sa2.sub(sum6, p5);
		float result2 = sa2.divide(sub5, p6);
		System.out.println("The result for (((((x1*x2)+x3)+x4)-x5)/x6) = " + result2);
		// String a = s.next();
		// Integer b = s.nextInt();
		// float c = s.nextFloat();
		// System.out.println( a " "+ b + " "+ c);

	}
}
