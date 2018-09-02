import java.util.Scanner;

public class Evenhalf{
 static int n;
 static int j;

public static void main(String[] args){
Scanner sn= new Scanner(System.in);

System.out.println("enter the no");
n=sn.nextInt();

for(int i=1;i<=n;i++)
{

   if(i%2==0){

        System.out.println(i);
     j=i/2;
             
        System.out.println(j);  
 }

      
          

}
}
}