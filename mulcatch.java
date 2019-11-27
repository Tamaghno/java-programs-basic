class mulcatch
{
public static void main(String args[])
{
try
{
int s[]={1,2,3};
for(int i=0;i<4;i++)
System.out.println(s[i]);
}
catch(ArrayIndexOutOfBoundsException e)
{System.out.println(e);}

try
{
int d=0;
int g=42/d;
}
catch(ArithmeticException e)
{System.out.println(e);}

try
{
String h="ten";
int f=Integer.parseInt(h);
System.out.println(h);
}
catch(NumberFormatException e)
{System.out.println(e);}

}
}
