import java.util.Scanner;
public class LeapYear{
public static void main(String[] args){
Scanner sn=new Scanner(System.in);
int n;
System.out.println("enter the year");
n=sn.nextInt();
if(n%400==0){
System.out.println("the yearis leap year");
}
else{
   if(n%100==0){
   System.out.println("the year is not  aleap year");
}
  else if(n%4==0){
System.out.println("year is leap year");
}
else
System.out.println("year is not a leap year");
}
}

}