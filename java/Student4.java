

// program by using constructor;

 class Student2{
int rollno;
String name;
String colgename;


void Student2(int r,String n,String c){
 
rollno = r;
name = n;
colgename = c;

}
void display(){
System.out.println(rollno+ " "+name +"" +colgename);
}
}



public class Student4{
public static void main(String[] args){

Student2 s1= new Student2();
s1.Student2(12,"Bhavna","kiet");
s1.display();
}
}




