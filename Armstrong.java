import java.util.Scanner;
public class Armstrong
{
public static void main (String [] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the number ");
int n = s.nextInt();
int a,temp;
int b=0;
temp=n;
while (n>0)
{
a=n%10;
n=n/10;
b=b+(a*a*a);
}
if (temp==b)
{
System.out.println("amstrong number");
}
else
{

System.out.println("not armstrong number");
}
}


}