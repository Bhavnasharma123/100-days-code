import java.util.Scanner;
public class Fact{
static int n,fact=1,i;
public static void main(String[] args){
Scanner sn=new Scanner(System.in);
System.out.println("enter the number");
n=sn.nextInt();
if(n>0){
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("fact of the given number" +fact );
}
else
System.out.println(" the given no is negative" );

}
}