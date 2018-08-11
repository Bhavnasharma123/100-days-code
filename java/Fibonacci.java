

import java.util.Scanner;

public class Fibonacci{

public static void main(String[] args){
Scanner sn= new Scanner (System.in);
int n,t1=0,t2=1,sum;
System.out.println("enter the no where upto to want");
n=sn.nextInt();

for(int i=1;i<=n;i++)
{
sum=t1+t2;
t1=t2;
t2=sum;
System.out.println("the series is " +t1);

}

}
}

 
