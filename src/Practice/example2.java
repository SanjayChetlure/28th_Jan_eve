package Practice;

public class example2 
{
	public static void main(String[] args) {
		
		
		
int tem=0;
		
		for(int i=10;i<20;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					tem=tem+1;
				}
			}
			if(tem==0)
			{
				System.out.print(i+",");
			}
			else
			{
				tem=0;
			}

		}
		System.out.println("");
		
		
	}

}
