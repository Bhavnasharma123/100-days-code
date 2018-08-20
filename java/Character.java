import java.util.Scanner;
public class Character{
public static void main(String[] args){
Scanner sn =new Scanner(System.in);
char ch;
System.out.println("enter the character");
ch=sn.next().charAt(0);


if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u'|| ch=='U')
System.out.println("character is vowel" );
else
System.out.println("charcter is consonant ");
}
}