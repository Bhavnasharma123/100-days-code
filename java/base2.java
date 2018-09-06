class Base2{

{
System.out.println("fib");
}

static {
System.out.println("fsb");

}

Base2(){
System.out.println("constructor");
}

public static void main(String[] args){
 //Base2 b1 = new Base2();
System.out.println("main");
}


static {
System.out.println("ssb");
}

{
System.out.println("sib");
}
}