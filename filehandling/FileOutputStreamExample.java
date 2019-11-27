import java.io.FileOutputStream;
public class FileOutputStreamExample {
    public static void main(String args[]){
           try{
             FileOutputStream fout=new FileOutputStream("/home/tam/devjava/testout.txt");
             String s="file output stream an output stream used for writing data to a file"; 
             byte b[]=s.getBytes();//converting string into byte array
             fout.write(b);
             fout.close();
             System.out.println("success...");
            }catch(Exception e){System.out.println(e);}
      }
}
