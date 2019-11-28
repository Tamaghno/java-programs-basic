import java.io.*;
public class SortWords
{
static String s="";

public static void main(String args[])throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	acceptWords();
}


public static void acceptWords()throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	System.out.println("enter the sentence");
	s=in.readLine();

	String[] words = s.split("\\s+");
	for (int i = 0; i < words.length; i++) 
	{
    		words[i] = words[i].replaceAll("[^\\w]", "");
	}
	String ss="";
	ss=arrange();
	display(ss);
}


public static String arrange()
  {
	String str="";
	String[] array = s.split("\\s+");
	for (int i = 0; i < array.length; i++) 
	{
	    array[i] = array[i].replaceAll("[^\\w]", "");
	}
    	for ( int j=0; j < array.length-1; j++ )
    	{
      
      	int min = j;
      	for ( int k=j+1; k < array.length; k++ )
        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

      	String temp = array[j];
      	array[j] = array[min];
      	array[min] = temp;
    	}
	for(int i=0;i<array.length;i++)
	str+=array[i]+" ";
	return str;
 
  }
public static void display(String str)
{
System.out.println("the old sentence was : "+s);
System.out.println("the new sentence is : "+str);
}
}


/*
..........................Output..........................


enter the sentence
the quick brown fox jumped over the black wall
the old sentence was : the quick brown fox jumped over the black wall
the new sentence is : black brown fox jumped over quick the the wall


enter the sentence
kolkata is a wonderful city     
the old sentence was : kolkata is a wonderful city
the new sentence is : a city is kolkata wonderful  
*/
