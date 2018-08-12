import java.util.Scanner;
public class EvenOdd{
public static void main(String[] args){
Scanner sn=new Scanner (System.in);
int n;
System.out.println("enter the no");
n=sn.nextInt();
if(n%2==0)
{
System.out.println("the no. is even");
}
else
{

System.out.println("the no. is odd");
}
}
}