class student
{
int roll;String name;

student(int roll,String name)
{this.name=name;this.roll=roll;}

public String toString()
{
return name+"  :  "+roll;
}

}

class student_toString
{
public static void main(String args[])
{
student s1=new student(27,"tama");
student s2=new student(28,"tamag");

System.out.println(s1+"  ::::  "+s2);

}
}
