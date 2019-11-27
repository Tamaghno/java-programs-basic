class hi extends Thread
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
class threaddemo
{
public static void main(String args[])
{
hi obj=new hi();
obj.start();
}
}
