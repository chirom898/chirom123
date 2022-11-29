import java.util.Scanner;
class ArraySearch
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
/*
for(int i=0;i<a.length;i++)
{
	System.out.println("a["+i+"] value=="+a[i]);
}
*/
System.out.println("enter the search number");
int k=in.nextInt();
boolean res=false;
int l=0;
int count=0;

for (count=0;count<a.length;count++)
{
for (int i=0;i<a.length;i++)
{
	
			if (a[i]==k && i>count)
			{
			res=true;
			l=i;
		
			}	
			
			
}
System.out.println("index is == a["+l+"]");
}
/*if (res)
{
	
	System.out.println("index is == a["+l+"]");
}
else 
{
	System.out.println("not found");
}	
*/


}
}
