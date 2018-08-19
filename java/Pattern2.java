import java.util.Scanner;
public class Pattern2{
public static void main(String[] args){
int r,val,n,count=1;
Scanner sn = new Scanner(System.in);
System.out.println("enter the no of rows");
n = sn.nextInt();

for(r=1;r<=n;r++)

{

for(val=1;val<=r;val++)
{
System.out.print(r);
}
count++;
System.out.println();
}
}
}