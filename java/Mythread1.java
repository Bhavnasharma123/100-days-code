
//priority of main Thread.


class Mythread1 extends Thread
{
  public static void main(String[] args)
   {
      System.out.println(Thread.currentThread().getPriority());

//change  also the priority of main thread.

      Thread.currentThread().setPriority(8);  
      System.out.println(Thread.currentThread().getPriority());
    }
}