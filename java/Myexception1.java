public class Myexception1{
public static void main(String[] args)
{
int i,j,k;
i=4;
j=0;
int a[]=new int[4];
for(int b=0;b<4;b++)
{
try{

a[i]=b+1;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);

}

System.out.println(a[b]);
}

try{
k=i/j ;
}

catch(ArithmeticException e)
{
System.out.println(e);

}
}
}