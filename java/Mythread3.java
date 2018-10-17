
//priority of main Thread.


class Mythread3 extends Thread
{
  public static void main(String[] args)
   {
      System.out.println(Thread.currentThread().getPriority());

//change  also the priority of main thread.

      Thread.currentThread().setPriority(8);  
      System.out.println(Thread.currentThread().getPriority());

//child priority  will access on basis of parent thread.


       Mythread3 t = new Mythread3();
      System.out.println(t.getPriority());     
    
     
       
      t.setPriority(3);
      System.out.println(t.getPriority());  


    }
}