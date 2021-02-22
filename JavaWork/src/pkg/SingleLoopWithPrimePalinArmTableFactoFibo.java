package pkg;
//Single Loop Assignment
import java.util.Scanner;

public class SingleLoopWithPrimePalinArmTableFactoFibo {
	public static void main(String[] args) {
		// 3. A number is prime or not 		
	/*	Scanner s = new Scanner(System.in);	
		System.out.println("Please enter a number");
		int a = s.nextInt();
		int b = 0;
		//for (int i = 2; i <= a - 1; i++) {
		for (int i = 2; i <= a /2; i++) {	//optimized way
			if (a % i == 0) {
				b = b + 1;
			}
		}
		if (b == 0) {
			System.out.println( a + " is a prime number");
		} else {
			System.out.println(a + " is not a prime number");
		}*/
		
		// 4. A number is palindrome or not--121--reversal of the number
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		int temp = a;
		int rev =0;
		int rem = 0;
		
		while(temp!=0) 
		{
			rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		if(a==rev) {
			System.out.println(a + " is a palindrome number");
		}
		else {
			System.out.println(a + " is not a palindrome number");
		}*/
		
	// 5. A number is Armstrong or not-----153----1+125+27
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		int temp1 =a;
		int length=0;
		
		while(temp1!=0) {
			length=length+1;
			temp1=temp1/10;
		}
		
		int temp2 =a;
		int arm = 0;
		
		while(temp2!=0) {
			int multiply =1;
			int rem =temp2%10;
			for(int i=1;i<=length;i++) {
				multiply=multiply*rem;				
			}
			arm=arm+multiply;
			temp2=temp2/10;
			}
		if(arm==a) {
			System.out.println(a + " is an Armstrong number");
		}
		else {
			System.out.println(a + " is not an Armstrong number");
		}*/
		
	// 6. Print any Table 
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		int table=0;
		for(int i=1; i<=10;i++) {
			table = a*i;
			System.out.println( a + "X" + i+"="+table);
		}*/
	
		// 7. Factorial of a number
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Please enter a number");
		int a = s.nextInt();
		int factorial=1;
		
		for(int i=1; i<=a; i++) {
			
			factorial = factorial*i;
		}
		System.out.println("Factorial of  " + a + " is "+factorial);*/
	
		// 8. Fibonacci series up to 12
		
	/*	int a=0;
		int b=1;
		int sum=0;
		
		for(int i=0; i<=10;i++) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}