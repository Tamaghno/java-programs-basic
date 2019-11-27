import java.time.*;
import java.io.*;

class stopwatch
{
private static Instant start;
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("1 to start, 2 to stop, 0 to end :");

while(true)
{
String k=in.readLine();
if(k.equals("1"))
{
start=Instant.now();
System.out.println("start time :"+start);
continue;
}
if(k.equals("2"))
{
Instant stop=Instant.now();
System.out.println(Duration.between(start,stop).toMillis()/1000.0+" secs");
}
if(k.equals("0"))
{
System.out.println("end");
break;
}
}
}
}
