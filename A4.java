interface Printable
{
	public void print();
}
interface Showable
{
	public void show();
}
class afour implements Printable,Showable
{
	public void print()
	{
	System.out.println("printable");
	}
	public void show()
	{
	System.out.println("showable");
	}
	
}
class A4 
{
public static void main(String args[])
	{
	Printable ob=new afour();
	ob.print();
	Showable ob2=new afour();
	ob2.show();
	}
}

