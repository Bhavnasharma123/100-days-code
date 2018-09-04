// program to print statement without main method execution.
 
class Test4{
static {
System.out.println("static block");
System.exit(0);
}
public static void main(String[] args){

System.out.println("Hello");
}
}