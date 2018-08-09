import java.util.Scanner;
public class CountDigit{

public static void main(String[] args){
int count=0;
Scanner sn = new Scanner(System.in);

System.out.println("enter the no");
int n=sn.nextInt();
while(n!=0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}