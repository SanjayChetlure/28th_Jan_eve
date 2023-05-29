package Constructor;

public class Sample7 
{
	//example4: user defined constructor --> multiple constructor   --> constructor overloading
	
	
	int num1;
	int num2;
	String name;   //Smita
	
	
	//user defined without/zero parameter constructor
	Sample7()
	{
		num1=10;
		num2=20;
	}
	
	//user defined with 2 int (int, int) parameter constructor
	Sample7(int a, int b)
	{
		num1=a;
		num2=b;		
	}
	

	//user defined constructor with String parameter
	Sample7(String s1)  //Smita
	{
		name=s1;   //Smita
	}
	
	
	public void studentName() 
	{
		System.out.println(name);
	}
	
	
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	
	
	
	public static void main(String[] args)
	{
		Sample7 s7=new Sample7();
		s7.add();    //30
		
		System.out.println("-----");
		
		Sample7 s8=new Sample7(5, 6);
		s8.add();       //11
		
		System.out.println("-----------");
		
		Sample7 s9=new Sample7("Smita");
		s9.studentName();
		
		
	}

}
