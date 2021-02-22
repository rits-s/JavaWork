package pkg;
// Double Loop Assignment
public class DoubleLoopWithStarsAndNumberPatterns	
{
	public static void main(String[] args) {
	
	// **************************1**************************
	{
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
// **************************2**************************
	/*{
		for (int i = 1; i <= 5; i++) 	
		{
			for (int j = 5; j >=i; j--) 
			{
				System.out.print("*");
			}
			System.out.println();			
		}
	}*/
	
	// **************************3**************************

	/*{
		for (int i = 1; i <= 4; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}*/
	
	// **************************4**************************
	
	/*{
		int count = 0;
		for (int i = 1; i <= 4; i++) 
		{			
			for (int j = 1; j <= i; j++) 
			{
				count = count+1;
				System.out.print(count + " ");
			}
			System.out.println();
		}
	}*/

	// **************************5**************************

		/*for (int i =1; i<=5; i++)
		{
			for (int j=4;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i;k++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/

		// **************************6**************************
	
		/*for (int i = 1; i<= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int l = 2; l <= i; l++) {
				System.out.print("*");
			}
			System.out.println("");
		}*/

	//***********************************************************	
		
	}
}
