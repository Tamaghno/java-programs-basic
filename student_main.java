class student
{
String name="";
student(){
name="unknown";
}
student(String n){
name=n;
}
public void printname(){
System.out.println("name is   :"+name);
}}
public class student_main
{
public static void main(String args[])
{
student ob1=new student();
student ob2=new student("tam");
ob1.printname();
ob2.printname();
}
}
