package UseOfStaticNonStatic;

public class Emp 
{
	String empName;
	int empID;
	//String empCEOName;
	static String empCEOName;
	
	
	
	public void empInfo() 
	{
		System.out.println(empName + ": "+empID+": "+empCEOName );
	}
	
}
