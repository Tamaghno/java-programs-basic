import java.io.*;

interface Stackk
{
public void push(int n);
public void pop();
public void display();
}
class stack implements Stackk
{
int cap,flag=-1,ar[];
stack(int size)
{cap=size;
ar=new int[size];}

public void push(int x)
{
if(flag==cap-1)
System.out.println("Stack is full");
else
ar[++flag]=x;
}
public void pop()
{
if(flag==-1)
System.out.println("Stack underflow");
else
{
System.out.println("popped  : "+ar[flag]);
flag--;
}
}
public void display()
{
for(int i=0;i<=flag;i++)
System.out.print(ar[i]+"\t");
}

public static void main(String rags[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
//BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter capacity");
int size=Integer.parseInt(in.readLine());
int ch;
stack ob=new stack(size);
while(true)
{
System.out.println("1 to push, 2 to pop, 3 to display, 4 to end");
ch=Integer.parseInt(in.readLine());
if(ch==1)
{System.out.println("which element to be pushed ?");
int p=Integer.parseInt(in.readLine());
ob.push(p);
//continue;
}
if(ch==2)
ob.pop();//continue;}
if(ch==3)
ob.display();//continue;}
if(ch==4)
System.exit(0);

}
}

}
