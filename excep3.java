class excep3
{
static void print(int n)
{
try
{
System.out.println("number passed is : "+n);
if(n<2 || n>5)
throw new IllegalArgumentException("number <2 >5");
}
catch(IllegalArgumentException e){System.out.println("caught in slot 1");throw e;}

}
public static void main(String argsp[])
{
try{print(9);}
catch(IllegalArgumentException e){System.out.println(e);}
}
}

