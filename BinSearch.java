import java.io.*;
public class BinSearch
{
static String words[];

public static void main(String args[])throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	acceptWords();
}


public static void acceptWords()throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	words=new String[10];
	System.out.println("enter ten words");
	for(int i=0;i<10;i++)	
	words[i]=in.readLine();
	bubsort();
	String w="";
	System.out.println("enter the word to be searched : ");
	w=in.readLine();
	if(binsearch(w)==true)
	System.out.println("Word Found");
	else
	System.out.println("Word Not Found");
}


public static void bubsort()
{
	String tempStr="";        
	for (int t=0; t<words.length-1; t++)
        {
           for (int i = 0; i<words.length -1; i++)
           {
               if(words[i+1].compareTo(words[1+1])>0)
               {
                   tempStr = words[i];
                   words[i] = words[i+1];
                   words[i+1] = tempStr;
                }
            }

        }
	
}
public static boolean binsearch(String x)
{
 	int low = 0;
        int high = words.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (words[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (words[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
}
}

/*
.................output.........................
enter ten words
i
am
monkey
apple
umbrella
honey
xerox
done
word
ten
enter the word to be searched : 
ten
Word Found


enter ten words
here
are
ten
words
to
be
searched
from
the
array
enter the word to be searched : 
hakunamatata
Word Not Found


*/
