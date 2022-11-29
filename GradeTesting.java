/* program to generate as per next choice students grade based on his marks min 40 max 100

grade total >=90 A++
total >=80 and <90 A
total >=70 and <80 B
total >=40 and <70 C
total<40 Fail

*/
import java.util.Scanner;
public class GradeTesting
{

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter student name");
String stdname=s.nextLine();
System.out.println("Enter student id");
String stdid=s.nextLine();
System.out.println("Enter students marks1");
int stdmrks1=s.nextInt();
System.out.println("enter students marks2");
int stdmrks2=s.nextInt();
System.out.println("enter students marks3");
int stdmrks3=s.nextInt();
int total=stdmrks1+stdmrks2+stdmrks3;
int percent=(total*100)/300;
boolean result;
String grade;
if(stdmrks1>=40 && stdmrks2>=40 && stdmrks3>=40 && percent>=90)
{
	result=true;
	grade="A++";
	
}
else if (stdmrks1>=40 && stdmrks2>=40 && stdmrks3>=40 && percent>=80 && percent<90)
{
	
	result=true;
	grade="A";
	
}
else if (stdmrks1>=40 && stdmrks2>=40 && stdmrks3>=40 && percent>=70 && percent<80)
{
	result=true;
	grade="B";

}
else 
{
	result=false;
	grade="fail";
	
}
System.out.println("stdname\t stdid\t stdmrks1\t stdmrks2\t stdmrks3\t total\t percent\t result\t grade");
System.out.println(stdname+"\t"+stdid+"\t"+stdmrks1+"\t"+stdmrks2+"\t"+stdmrks3+"\t"+total+"\t"+percent+"\t"+result+"\t"+grade);

	
}
}