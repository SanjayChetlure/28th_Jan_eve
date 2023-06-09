package Constructor;

public class Sample1 
{
	//example1: default Constructor
	
	
	//default constructor  --> provided by compiler
	//use: to copy/load all the members of class into object
//	Sample1()
//	{
//		
//	}
	
	
	public static void main(String[] args) 
	{				
		Sample1 s1=new Sample1();      //default constructor call from same class 
		s1.m1();
		s1.m2();
		
		
		//1: sample1 -> classname  --> datatype
		//2: s1 --> objectName  --> to identify/refer object
		//3: new --> keyword --> use to create empty/blank object
		//Sample1() --> classname() --> constructor call --> 
		
		
		System.out.println("-------------------------");
		
		Sample2 s2=new Sample2();    // default constructor call from diff class
		s2.m3();
		s2.m3();
					
	}
	
	
	public void m1() 
	{
		System.out.println("running method m1");
	}

	
	public void m2() 
	{
		System.out.println("running method m2");
	}

}
