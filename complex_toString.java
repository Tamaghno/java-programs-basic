class complex
{
int real,img;

complex(int real,int img)
{this.real=real;this.img=img;}

public String toString()
{
return real+" + i("+img+")";
}
}
class complex_toString
{
public static void main(String args[])
{
complex s1=new complex(27,22);
complex s2=new complex(28,23);

System.out.println(s1+"  ::::  "+s2);
add(s1,s2);
sub(s1,s2);
}
public static void add(complex s1,complex s2)
{
complex s3=new complex(0,0);
s3.real=s1.real+s2.real;
s3.img=s1.img+s2.img;
System.out.println("added  :  "+s3);
}
public static void sub(complex s1,complex s2)
{
complex s3=new complex(0,0);
s3.real=s1.real-s2.real;
s3.img=s1.img-s2.img;
System.out.println("sub  :  "+s3);
}




}
