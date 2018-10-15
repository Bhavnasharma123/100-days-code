class Threading extends Thread{
 
public void run(){

                    for(int i=0;i<5;i++)
                      {
                         System.out.println("thread method");
                       }
                  }

                               }



public class Multithreading{


public static void main(String[] args){

Threading t = new Threading();


t.start();

System.out.println("main method");                                     
                             }   

                         }    



