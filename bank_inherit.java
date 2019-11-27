abstract class bank//class bank
{
	String name,branch,ifsc;
	bank(String n,String b,String f)
	{
	this.name=n;this.branch=b;this.ifsc=f;
	}
	//double fd(){return 0;};
	abstract double fd();
}
class sbi extends bank
{
	sbi(String n,String b,String f)
	{
	super(n,b,f);
	}
	double fd()
	{
	return (500*0.07*1);
	}
}
class hdfc extends bank
{
	hdfc(String n,String b,String f)
	{
	super(n,b,f);
	}
	double fd()
	{
	return (500*0.08*1);
	}
}

class bank_inherit
{
	public static void main(String args[])
	{
	sbi ob=new sbi("SBI","behala","sbi001");
	double amt1=ob.fd();
        hdfc ob1=new hdfc("HDFC","behala","hdfc001");
	double amt2=ob1.fd();
   	System.out.println("SBI  :  "+amt1+"   HDFC  :  "+amt2);
	}
}

