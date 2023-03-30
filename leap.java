import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int start,end;
System.out.println("Enter starting year: ");
start = sc.nextInt();
System.out.println("Enter ending year: ");
end = sc.nextInt();
System.out.println("Leap years are ");
for(int i=start;i<=end;i++)
{
if(i%4==0||(i%100!=0)&&(i%400==0))
System.out.println(i);
}
}
}
