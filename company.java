//import java.io.*;
class company_demo
{
    void address()
    {
        System.out.println("called parent calss");
    }
}
class flipkart extends company{

    String add,name;
    flipkart(String a, String n)
    {
        add=a; name=n;
    }
    void address()
    {
        System.out.println("flipkart address :"+add);
        System.out.println("flipkart ceo name :"+name);
    }
}
class amazon extends company{

    String add,name;
    amazon(String a, String n)
    {
        add=a; name=n;
    }
    void address()
    {
        System.out.println("amazon address :"+add);
        System.out.println("amazon ceo name :"+name);
    }
}
class company
{
    public static void main(String args[])
    {
    flipkart f=new flipkart("mumbai","krishnamurthy");
    amazon a=new amazon("USA", "jeffbezos");

    f.address();
    a.address();

    

    }
}