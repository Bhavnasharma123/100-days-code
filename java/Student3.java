 class Student2{
int rollno;
String name;
String colgename;


void parameter(int r,String n,String c){
 
rollno = r;
name = n;
colgename = c;

}
void display(){
System.out.println(rollno+ " "+name +"" +colgename);
}
}



public class Student3{
public static void main(String[] args){

Student2 s1= new Student2();
s1.parameter(12,"Bhavna","kiet");
s1.display();
}
}




