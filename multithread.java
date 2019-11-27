class multi extends Thread
{
static int i=0;
multi()
{this.i++;}

public void run()
{
System.out.println(i);
}
}
class multithread
{
public static void main(String args[])
{
try{
for(int i=0;i<=4;i++)
{
multi obj=new multi();
obj.start();
Thread.sleep(1000);
}}
catch(InterruptedException e){System.out.println(e);}
}
}
