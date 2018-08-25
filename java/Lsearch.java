import java.util.Scanner;

public class Lsearch{
static int item;
   public static void main(String[] args){

    

    int[] a={10,20,30,40,50,40};

   for(int i=0;i<a.length;i++){
  
     System.out.println(a[i]);
 
     }

      System.out.println("enter the element to be searched");
  
   Scanner sn= new Scanner(System.in);
    item=sn.nextInt();

   for(int i=0;i<a.length;i++){
     if(a[i]==item){

      System.out.println("item is found "  +item +" at Position "+(i+1));

      }

    else{

      System.out.println("item not found");

         }     
       }

   }

  }

