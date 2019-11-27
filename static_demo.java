class demo
{
public static int a,b;
public static void member(int x)
{
a=x;
inib();
System.out.print(a+" "+b);
}
public static void inib()
{
b=4*a;
}
}
class static_demo
{
public static void main(String args[])
{
demo.member(3);
}
}
