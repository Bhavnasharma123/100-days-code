import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
int r,sp,val,n,t;
Scanner sn = new Scanner(System.in);
System.out.println("enter the no of rows");
n = sn.nextInt();

for(r=1;r<=n;r++)
{
for(sp=1;sp<=n;sp++)
{
System.out.print(" ");
}
n--;
for(val=1;val<=r;val++)
{
System.out.print(val+" ");
}
System.out.println();
}
}
}