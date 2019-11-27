import java.io.*;
class cmdline_except
{
public static void main(String args[])
{
try
{
System.out.println("argument length is : "+args.length);
if(args.length==0)
throw new ArithmeticException("e");
	try
	{if(args.length==1)
	 throw new ArithmeticException("f");	
	
		try
		{
		if(args.length==2)
		throw new ArrayIndexOutOfBoundsException("ar");
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
		System.out.println(ar);
		}	
	}
 	
	catch(ArithmeticException f)
	{
	System.out.println(f);
	}

}
catch(ArithmeticException e)
	{
	System.out.println(e);
	}
}
}
