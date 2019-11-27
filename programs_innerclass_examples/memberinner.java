class memberinner
{
private int data=30;
class inner
{
void msg(){System.out.println("inside inner out data"+data);}
}
public static void main(String rags[])
{
memberinner obj=new memberinner();
memberinner.inner in=obj.new inner();
in.msg();
}
}
