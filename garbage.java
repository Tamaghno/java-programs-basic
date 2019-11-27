class garbage
{
public static void main(String args[])
{
Runtime r=Runtime.getRuntime();

long m;

System.out.println("total memory \t"+r.totalMemory());

m=r.freeMemory();
System.out.println("Free memory called :\t"+m);

r.gc();

m=r.freeMemory();

System.out.println("GC called :\t"+m);

Integer p[]=new Integer[10000];

for(int i=0;i<1000;i++)
p[i]=new Integer(i);

m=r.freeMemory();
System.out.println("final memory \t"+m);

for(int i=0;i<1000;i++)
p[i]=null;

m=r.freeMemory();
System.out.println("final memory after null \t"+m);

}
}
