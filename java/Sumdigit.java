import java.util.Scanner;
public class Sumdigit{
public static void main(String[] args){
Scanner sn = new Scanner(System.in);

int n,rem,sum=0;
System.out.println("enter the no");
n= sn.nextInt();
while(n!=0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println(sum);
}
}
