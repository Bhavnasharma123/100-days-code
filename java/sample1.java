
import java.util.Scanner;
public class sample1{
Scanner sn =new Scanner(System.in);
public static void main(String args[])
{
int a,b,sub,add,rem,quo;
Scanner sn =new Scanner(System.in);
System.out.println("enterthe two number");
a=sn.nextInt();
b=sn.nextInt();
sub=a-b;
add=a+b;
rem=a%b;
quo=a/b;


System.out.println("the difference of these numbers:"+sub);
System.out.println("thesum of these numbers:"+add);
System.out.println("thesum of these numbers:"+rem);
System.out.println("thesum of these numbers:"+quo);
}
}
 