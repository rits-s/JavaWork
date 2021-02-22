package pkg;
import java.util.Scanner;
public class SwappingNumbers {
	public static void main(String[] args) {
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a value for a");
		a = s.nextInt();
		System.out.println("Please enter a value for b");
		b = s.nextInt();
		
		/*c = a; // 12
		a = b; // 23
		b = c; // 12
		*/
		a=b;//20
		b=a; //10
		c=a;
		System.out.println("After swapping numbers between a and b using third variable:");
		System.out.println("a " + a);
		System.out.println("b " + b);

		int x, y;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter a value for x");
		x = s1.nextInt();
		System.out.println("Please enter a value for y");
		y = s1.nextInt();

		x = x + y;
		y = x - y;
		x = x - y;

	  //  x = x*y; y = x/y; x = x/y;
		
		System.out.println("--------------------------");
		System.out.println("After swapping numbers between x and y without using third variable:");
		System.out.println("x " + x);
		System.out.println("y " + y);

	}
}
