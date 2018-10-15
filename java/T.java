// working with thread with sleep method.

class Sh{



public void method(){
for(int i=0;i<8;i++)
{
System.out.println("Hi");

try{
Thread.sleep(500);
}
catch(InterruptedException e)
{
}		     }	

}


	}




public class T{
public static void main(String[] args){

Sh s = new Sh();              

s.method();
                                       }
              }    