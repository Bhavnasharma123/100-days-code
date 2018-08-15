import java.util.Scanner;
public class Palindrome {
public static void main(String[] args){
Scanner sn = new Scanner(System.in);
int n,rem,sum=0,temp;
System.out.println("enter the no.");
n= sn.nextInt();
temp=n;
while(temp!=0){
rem=temp%10;
sum=(sum*10)+rem;
temp=temp/10;
}
if(n==sum)
System.out.println("the no is palindrome");
else
System.out.println("the no is not a palidrome");

}
}