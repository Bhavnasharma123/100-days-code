import java.util.Scanner;

public class Even{

public static void main(String[] args){
Scanner sn = new Scanner(System.in);
int n;

System.out.println("enter the number upto print even number");
n=sn.nextInt();

for(int i=1;i<=n;i++)
{
   if(i%2==0){

       System.out.println(i);
              }
}
}
}

