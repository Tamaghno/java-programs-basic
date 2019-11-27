import java.io.IOException;

abstract class shape
{
    double d1,d2;
    shape(double d1,double d2)
    {
        this.d1=d1;
        this.d2=d2;
    }
    abstract double area();
}
class rect extends shape
{
    rect(double l,double b)
    {
        super(l,b);    }

        void show()
        {
            System.out.println("length   "+d1+"breadth   "+d2+"area   "+area());
        }
        double area()
        {
            return d1*d2;
        }
}
class tri extends shape
{
    tri(double b,double h)
    {
        super(b,h);    }

        void show()
        {
            System.out.println("length   "+d1+"breadth   "+d2+"area   "+area());
        }
        double area()
        {
            return 0.5*d1*d2;
        }
}
class shape_abstract
{
    public static void main(String args[])throws IOException
    {
        rect r=new rect(5,6);
        tri t=new tri(5,6);
        r.show();
        t.show();
    }
}