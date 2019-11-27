class NewThread implements Runnable
{
String name;Thread t;
NewThread(String threadname)
{
name=threadname;
t=new Thread(this,name);
System.out.println("new thread : "+t);
t.start();
}

public void run()
{
	try
	{
	for(int i=5;i>0;i--)
	{
	System.out.println("name : "+i);
	Thread.sleep(1000);
	}
	}
	catch(InterruptedException e){}

System.out.println("exit of thread : "+name);
}

}

class demo_join
{
public static void main(String args[])
{
NewThread ob1=new NewThread("1");
NewThread ob2=new NewThread("2");
NewThread ob3=new NewThread("3");

System.out.println("thread 1 alive : "+ob1.t.isAlive());
System.out.println("thread 2 alive : "+ob2.t.isAlive());
System.out.println("thread 3 alive : "+ob3.t.isAlive());

try
{
ob1.t.join();
ob2.t.join();
ob3.t.join();
}

catch(Exception e){}

System.out.println("Thread main : "+Thread.currentThread().isAlive());

}
}
