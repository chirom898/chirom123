import java.util.Scanner;
public class Recuresive
{
	static Recuresive r=new Recuresive();
public static void main (String [] args)
{
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a value");
	int a = in.nextInt();
	int z=r.factorial(a);
	System.out.println("main");
	System.out.println("result=="+z);	
}
 int factorial(int x)
 {
	 if (x>=1)
	 {
	 return x*r.factorial(x-1);
	 }
	 else 
		 return 1;
 }
	 


}