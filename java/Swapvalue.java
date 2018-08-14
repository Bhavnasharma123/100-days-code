import java.util.Scanner;
public class Swapvalue{
public static void main(String[] args){
int a,b;
Scanner sn=new Scanner(System.in);
System.out.println("enter the value of a=");
System.out.println("enter the value of b=");
a=sn.nextInt();
b=sn.nextInt();
a= a+b;
b= a-b;
a=a-b;

System.out.println("enter the value of a=" +a);
System.out.println("enter the value of b=" +b);
}
}