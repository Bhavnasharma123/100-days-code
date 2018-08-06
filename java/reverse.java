import java.util.Scanner;
 public class Reverse{
static int n,rev=0;
public static void main(String[] args){
Scanner sn = new Scanner(System.in);

System.out.println("enter the no");
n = sn.nextInt();
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n%10;
}
System.out.println("the reverse no is"+rev);
}
}


