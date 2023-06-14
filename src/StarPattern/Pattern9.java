package StarPattern;

public class Pattern9
{
	public static void main(String[] args)
	{
		//  *
		// **
		//***
		
		
		int space=2;
		int star=1;
		
		for(int i=1; i<=3; i++)  // outer for loop --> rows
		{
			for(int j=1; j<=space; j++)   //1st inner for loop-> space
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			space--;
			star++;
			
		}		
	}
}
