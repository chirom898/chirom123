import java.util.Scanner;
class ExceptionTest
{
public void divide()throws Exception
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter a value");
	int a = s.nextInt();
	System.out.println("enter b value");
	int b = s.nextInt();
	try{
	int c=a/b;
	System.out.println("result=="+c);
	}
	catch (ArithmeticException e)
	{
		System.out.println("this is my exception");
		
	}
	finally
	{
		System.out.println("program ends");
		
	}
	
	
}

 	public static void main (String args []) throws Exception
	{
		ExceptionTest n= new ExceptionTest();
		n.divide();
		
	}
	

}