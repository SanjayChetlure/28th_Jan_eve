package Methods;

public class Sample5 
{
	//4: non-static regular method call from diff class
		
	public static void main(String[] args)
	{
		Sample6 s6=new Sample6();                   //step1: create an object of diff class
		s6.m7();                                    //step2: method call -> diffclassObjectName,methodname();
		s6.m8();
		s6.m8();		
	}

}
