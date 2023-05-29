package Methods;

public class Sample10 
{
	public static void main(String[] args)
	{		
		studentName("Priyanka");
		studentName("Amol");
		
		System.out.println("--------");
		
		studentFullName("abc", "xyz");
		studentFullName("abc1", "xyz1");
		
		System.out.println("--------");
		
		Sample11.studentInfo("Kuldeep", 101, 65.5f, 'A');
		Sample11.studentInfo("Priyanka", 102, 75.5f, 'B');
		
	}	
		
	//method with String parameter
	public static void studentName(String s1) 
	{
		System.out.println(s1);
	}
	
	//method with String,String
	public static void studentFullName(String fname, String lname) 
	{
		System.out.println(fname +" "+ lname);
	}
}
