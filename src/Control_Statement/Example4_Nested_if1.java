package Control_Statement;

public class Example4_Nested_if1
{
	public static void main(String[] args)
	{
		
		int PEM=100;
		int MEM=0;
		
		// 100>=300
		if(PEM>=300)           //outer if
		{
			System.out.println("Eligible for mains Exam");
			// 700>=800
			if(MEM>=800)       //nested or inner if
			{
				System.out.println("got selected");			
			}
			else
			{
				System.out.println("rejected from mains exam : MEM<800");
			}						
		}
		else
		{
			System.out.println("Not Eligible for Mains: PEM<300");
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if(condition1)       // outer if
//		{
//			if(condition2)       //inner if  or nested if
//			{
//				
//			}
//			else
//			{
//				
//			}						
//		}
//		else
//		{
//			
//		}
		
		
		
	}

}
