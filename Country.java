import java.io.*;
public class Country
{
static String country[];
static int n,popu[];

public static void main(String args[])throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	input();
}


public static void input()throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
	System.out.println("enter the number of countries : ");
	n=Integer.parseInt(in.readLine());
	country=new String[n];
	popu=new int[n];
	System.out.println("enter "+n+" countries details :\n");
	for(int i=0;i<n;i++)
	{
	System.out.print("Country name ["+(i+1)+"] :");	
	country[i]=in.readLine();
	System.out.print("Country population ["+(i+1)+"] :");
	popu[i]=Integer.parseInt(in.readLine());
	}
	arrange();
}
public static void arrange()
{	
	int temp;
	String tempstr;
           for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(popu[j-1] < popu[j]){  
                                  
                                 temp = popu[j-1];  
                                 popu[j-1] = popu[j];  
                                 popu[j] = temp;
				
				tempstr=country[j-1];
				country[j-1]=country[j];
				country[j]=tempstr;  
                         }  
                          
                 }  
         }
	display();
}
public static void display()
{
System.out.println("\nCountry\tPopulation");
for(int i=0;i<n;i++)
{
System.out.println(country[i]+"\t"+popu[i]);
}
}
}


/*
.....................output.....................

enter the number of countries : 
5
enter 5 countries details :

Country name [1] :India
Country population [1] :1200000
Country name [2] :China
Country population [2] :2000000   
Country name [3] :Russia
Country population [3] :1500000
Country name [4] :USA
Country population [4] :1100000
Country name [5] :Iran
Country population [5] :900000

Country	Population
China	2000000
Russia	1500000
India	1200000
USA	1100000
Iran	900000

*/
