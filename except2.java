class except2
{
static void print()
{
try
{
System.out.println("Explicit numberformat exception thrown");
throw new NumberFormatException("e");
}
catch(NumberFormatException e){System.out.println("caught in except 1");throw e;}

}
public static void main(String argsp[])
{
try{print();}
catch(NumberFormatException e){System.out.println("caught in except 2");}
}
}

