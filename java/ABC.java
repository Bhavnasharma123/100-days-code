// program on intance flow  control.
  
class ABC{

int i=10;
{

m1();
System.out.println("1st instance block");
}


ABC(){

System.out.println("constructor");
}


public static void main(String[] args){

ABC t1= new ABC();
System.out.println("main method");
}

public void  m1(){

System.out.println("j="+j);
}

{
System.out.println("2 instance block");
}

  int j=20;
   }

