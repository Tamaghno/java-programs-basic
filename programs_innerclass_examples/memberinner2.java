class memberinner2
{
private int data=30;

class inner
{
void msg()
{System.out.println("data : "+data);}
}

public static void main(String args[])
{
memberinner2 obj=new memberinner2();
memberinner2.inner in=obj.new inner();
in.msg();
}
}
