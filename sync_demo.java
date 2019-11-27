class sync extends Thread
{
synchronized void print()
{
try{
for(int i=1;i<=5;i++)
{System.out.println(i);Thread.sleep(1000);}
}
catch(Exception e){System.out.println(e);}
}
public void run()
{print();
}
}
class sync_demo
{
public static void main(String args[])
{
sync s1=new sync();
sync s2=new sync();
s1.start();
s2.start();

}
}
