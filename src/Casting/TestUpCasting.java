package Casting;

public class TestUpCasting 
{
	public static void main(String[] args)
	{
		
//		Son s=new Son();
//		s.bike();
//		s.car();
//		s.money();
//		s.home();
		
		
		
		//create object of sub class with reference/datatype of super lass
		
		
		Father s1=new Son(); 
		s1.car();
		s1.money();
		s1.home();
		//s1.bike(); 
		
	}

}
