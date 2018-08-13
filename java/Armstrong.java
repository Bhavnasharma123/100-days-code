import java.util.Scanner;
public class Armstrong{
public static void main(String[] args){
Scanner sn = new Scanner(System.in);
int n,temp,rem,res=0,digit=0;
System.out.println("enter the no");
n=sn.nextInt();

temp=n;
while(temp!=0){
digit++;
temp=temp/10;
}
while(temp!=0){
rem=n%10;
res=res+rem*rem*rem;
temp=temp/10;
}
if(res==temp){
System.out.println("the no is armstrong");
}
else
System.out.println("the no is not a armstrong");
}
}