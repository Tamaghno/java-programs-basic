import java.io.*;
class employee
{
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
System.out.println("name :"+name+"\t"+"ID :"+id);
}
}
class employee_main
{
DataInputStream in=new DataInputStream(System.in);
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int n;
System.out.println("how many employees :");
n=Integer.parseInt(in.readLine());
employee ob[]=new employee[n];
int i;
for(i=0;i<n;i++)
{
ob[i]=new employee();
ob[i].getdetails();
}
for(i=0;i<n;i++)
ob[i].showdetails();
}

}


