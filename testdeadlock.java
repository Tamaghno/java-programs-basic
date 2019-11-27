public class testdeadlock
{
public static void main(String args[])
{
final String r1="t";
final String r2="c";

Thread t1=new Thread(){

public void run()
{
synchronized(r1)
{
System.out.println("Thread t1 locks r1");
try{Thread.sleep(1000);}
catch(Exception e){}
}
synchronized(r2)
{
System.out.println("Thread t1 locks r2");
try{Thread.sleep(1000);}
catch(Exception e){}
}
}
};

Thread t2=new Thread(){

public void run()
{
synchronized(r1)
{
System.out.println("Thread t2 locks r1");
try{Thread.sleep(1000);}
catch(Exception e){}
}
synchronized(r2)
{
System.out.println("Thread t2 locks r2");
try{Thread.sleep(1000);}
catch(Exception e){}
}
}
};
t1.start();
t2.start();


}
}
