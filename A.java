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
class A 
{
public static void main(String args[])
	{
	afour ob=new afour();
	ob.print();
	ob.show();
	}
}

