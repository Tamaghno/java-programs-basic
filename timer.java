import java.time.*;

import java.util.*;
class timer
{
    private static Instant start;
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    
    // System.out.println("1 to start, 2 to stop, 3 to end");
    // String ch=sc.nextLine();
    while(true)
    {
        System.out.println("1 to start, 2 to stop, 3 to end");
        String ch=sc.nextLine();
        if(ch.equals("1"))
        {
            start=Instant.now();
            System.out.println("start : "+start);
            //continue;
        }
        if(ch.equals("2"))
        {
            Instant stop=Instant.now();
            System.out.println("stop : "+Duration.between(start,stop).toMillis()/1000.0+ "secs");
        }
        if(ch.equals("3"))
        {
            System.out.println("ended at : "+Instant.now());
            break;
        }
    }
}
}
