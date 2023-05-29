package Methods;

public class Sample9 
{
	//6: method with parameter	
	
	
	public static void main(String[] args)
	{
		m1(10,20);      //initialization    //30
		m1(5,6);   
		m1(50,3);
		
		System.out.println("---------");
		
		Sample9 s9=new Sample9();
		s9.m2(7, 6);      //42
		s9.m2(4, 3);     //12			
	}	
	
	//method with int, int parameter
	public static void m1(int num1, int num2)   // declaration    10 , 20
	{		
		System.out.println(num1+num2);             //use
	}
	
	//method with int,int parameter
	public void m2(int num3, int num4)   //4, 3
	{
		System.out.println(num3*num4);
	}

}
