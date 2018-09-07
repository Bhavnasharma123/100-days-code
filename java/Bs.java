 public class Bs{

public static void main(String[] args){

System.out.println("Hello");

display();

display("amit");

display("Bhavna","Shivani","Avinash");
}

static void display(String... value){

System.out.println("Display method");


for(int i=0;i<value.length;i++)
{

System.out.println(value[i]);
}
}
}