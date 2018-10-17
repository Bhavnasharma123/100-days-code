

// find the thread name in java.



public class MainThread  extends Thread
{

public static void main(String[] args)
{
  Thread t =  Thread.currentThread();
  
 System.out.println("the thread is "  +t.getName());

t.setName("Test");

 System.out.println("the thread is "  +t.getName());
}
}


