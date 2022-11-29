import java.util.Scanner;

public class Prime
	{
	public static void main (String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
	int n= s.nextInt();
	int i ;
	
       int flag=0;
	
	if (n==0 || n==1)
		{
		System.out.println(n+"is not prime");
		}

		else
			{
			for (i=2;i<n/2;i++)
				{
				if (n%i==0)
					{

					System.out.println(n+"is not prime");
					flag=1;
					break;
					}

					
				}	
				
						if (flag==0)
						{

						System.out.println(n+"is prime");

						}
				
					
				

			
			}
		

	}


	}