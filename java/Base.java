class Base{
private static String  m1(String msg)
{
System.out.println(msg);
return msg;
}

static String m =m1("1");

{
m=m1("2");
}

 static 
{
m = m1("3");
}

public static void main(String[] args){
Base o= new Base();
}
}






