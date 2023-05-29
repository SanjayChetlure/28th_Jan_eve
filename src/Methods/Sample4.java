package Methods;

public class Sample4 
{
	//3: non-static regular method call from same class
	
	//main method
	public static void main(String[] args)
	{
		System.out.println("Hi");
		// classname objectname =new classname();                       
		Sample4 s4=new Sample4();                         //step1: create an object/instance of class
		s4.m5();                                          //step2: method call --> objectname.methodname();
		s4.m6();
		s4.m6();
		
		//1: sample4-> classname  --> 	as a datatype (object type)
		//2: s4  --> objectName  --> use to identity/refer object
		//3: new  --> keyword  --> use to create blank/empty object
		//4: Sample4() --> classname() --> constructor --> use to copy all the members of class into object						
	}
	
	
	//non static -> regular method
	public void m5() 
	{
		System.out.println("running non-static regular method m5 from same class");
	}
	
	//non static -> regular method
	public void m6() 
	{
		System.out.println("running non-static regular method m6 from same class");
	}

}
