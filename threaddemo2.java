class hi implements Runnable
{
public void run()
{
int i;
for(i=1;i<=5;i++)
{
try
{Thread.sleep(1000);}
catch(Exception e){System.out.println(e);}
System.out.println("hi");
}
}
}
class threaddemo2
{
public static void main(String args[])
{
hi obj=new hi();
Thread t=new Thread(obj);
t.start();
}
}
