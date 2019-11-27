class A
{
void show()
{System.out.println("grandparent A");}
}
class B extends A
{
void show(){
super.show();
System.out.println("parent B");}
}
class C extends B{
void show(){
    super.show();
System.out.println("chid C parent B");}
}
class D extends A{
    void show(){
        super.show();
    System.out.println("chid D parent A");}
    }

class sample_inherit
{
public static void main(String args[])
{
C ob=new C();
D ob2=new D();
ob.show();
ob2.show();

}}
