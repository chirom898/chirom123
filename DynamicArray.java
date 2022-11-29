import java.util.Scanner;
public class DynamicArray
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter n value");
int n=in.nextInt();
int a[]=new int[n];
System.out.println("size of an array =="+a.length);
for(int i=0;i<a.length;i++)
{
	System.out.println("Enter a["+i+"] value");
	a[i]=in.nextInt();
}
for(int i=0;i<a.length;i++)
{
	System.out.println("a["+i+"] value==a[i]);
}

}
}