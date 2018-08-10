public class ReverseString {
 public static void main(String[] args) {
        String  a = "I am first one of them";
       
        String str[]=a.split(" ");
        
        for(int i=str.length-1;i>=0;i--){
            
            System.out.print(str[i]+" ");
            
        }
      }
   }
