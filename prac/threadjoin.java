class NewThread implements Runnable
{
String name="";
Thread t;

NewThread(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("Thread starts : "+name);
t.start();
}

public void run()
{int i;
try
{
for(i=5;i>0;i--)
{System.out.println("name : "+i);
Thread.sleep(1000);}
}
catch(InterruptedException e){}
System.out.println("Thread exits : "+name);
}

}

public class threadjoin
{
public static void main(String args[])
{
NewThread ob1=new NewThread("1");
NewThread ob2=new NewThread("2");
NewThread ob3=new NewThread("3");

System.out.println("Thread 1 is alive ? "+ob1.t.isAlive());
System.out.println("Thread 2 is alive ? "+ob2.t.isAlive());
System.out.println("Thread 3 is alive ? "+ob3.t.isAlive());

try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}
catch(InterruptedException e){}

System.out.println("Thread current is alive ? "+Thread.currentThread().isAlive());
}
}
