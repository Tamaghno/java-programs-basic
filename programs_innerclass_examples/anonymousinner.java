abstract class person
{
abstract void eat();
}

class anonymousinner
{
public static void main(String args[])
{
person p=new person(){
void eat(){System.out.println("mangoes");}
};
p.eat();
}
}
