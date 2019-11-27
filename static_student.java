import java.io.*;
class student
{
static String dept="CSE";
String name,id;
DataInputStream in=new DataInputStream(System.in);
public void getdetails()throws IOException
{
System.out.println("enter name :");
name=in.readLine();
System.out.println("enter ID :");
id=in.readLine();
}
public void showdetails()
{
System.out.println("name :"+name+"\t"+"ID :"+id+"\t"+"dept :"+dept);
}
}
class static_student
{
DataInputStream in=new DataInputStream(System.in);
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int n;
System.out.println("how many students :");
n=Integer.parseInt(in.readLine());
student ob[]=new student[n];
int i;
for(i=0;i<n;i++)
{
ob[i]=new student();
ob[i].getdetails();
}
for(i=0;i<n;i++)
ob[i].showdetails();
}

}


