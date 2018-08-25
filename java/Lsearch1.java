import java.util.Scanner;

public class Lsearch{
static int item ,x=0,position=0;
 
   public static void main(String[] args){
    int[] a={10,20,30,40,50,60};

   for(int i=0;i<a.length;i++){
  
     System.out.println(a[i]);
 
     }

      System.out.println("enter the element to be searched");
  
   Scanner sn= new Scanner(System.in);
    item=sn.nextInt();

   for(int i=0;i<a.length;i++){
     if(a[i]==item){
        
       x=1;
       position=i+1;
      
      }else{

         }     
       }

     if(x==1){

     System.out.println("item is found "  +item +" at Position "+position);
       position=0;
       
        
       }else{

          System.out.println("item not found");
         }

   }

  }

