package TypesOfVariables;

public class demo4 
{
	//Example3: non-static global variable
		
	int c=30;    //non-static global variable 
				
	public static void main(String[] args)
	{
		//non-static global variable call from same class 
		demo4 d4=new demo4();         //step1: create object of same class 
		System.out.println(d4.c);      //variabeClass : objectName.variableName				
		
		
				
		System.out.println("--------------------------");
		
		
		//non-static global variable call from diff class   
		demo5 d6=new demo5();     //step1: create object of diff class
		System.out.println(d6.d); //variableCall --> diffClassObjectName.variableName
	}
	
	
	public static void m1()
	{
		demo4 d5=new demo4();
		System.out.println(d5.c);		
	}
	
	public void m2()
	{
		System.out.println(c);     //variableName
	}

}
