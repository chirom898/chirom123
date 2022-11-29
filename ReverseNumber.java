import java.util.Scanner;
public class ReverseNumber 
{
public static void main(String [] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
int a;

int r=0;
String sh="";


while (n>0)
{
	a=n%10;
	
			
			sh=sh+a;
			n=n/10;
		

}

//System.out.println("reverse number without zero is "+r);

System.out.println("reverse number is =="+sh);
}
}