class staticnested
{
static int data=30;
static class inner
{
void msg(){System.out.println("data is : "+data);}
}
public static void main(String args[])
{
staticnested.inner obj=new staticnested.inner();
obj.msg();
}
}
