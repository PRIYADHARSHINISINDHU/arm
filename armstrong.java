import java.util.*;
import java.io.*;
class armstrong
{
public static void main(String[] args)
{
int n,a,sum=0,b,wholesum=0,rem=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
n=s.nextInt();
b=n;
while(n>0)
{
rem=n%10;
a=rem*rem*rem;
sum=sum+a;
n=n/10;
}
wholesum=sum;
if(b==wholesum)
{
System.out.println("The number is  an armstrong number");
}
else
{
System.out.println("The number is not an armstrong number");
}
}
}
