class staticinner
{
private static int data=30;

static class inner
{

void print()
{System.out.println("data : "+data);}
}
public static void main(String args[])
{
staticinner.inner obj=new staticinner.inner();
obj.print(); 
}
}

