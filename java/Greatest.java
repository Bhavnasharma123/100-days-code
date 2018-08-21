import java.util.Scanner;
public class Greatest{
public static void main(String[] args){
Scanner sn =new Scanner(System.in);
int a,b,c;
System.out.println("enter the 3 no");
a=sn.nextInt();
b=sn.nextInt();
c=sn.nextInt();
if(a>=b && a>=c)

System.out.println( "the  greatest no is " +a);

else if(b>=a && b>=c)
System.out.println("the  grearest no is " +b);
else
System.out.println( " the  greatest no is"+c);
}
}