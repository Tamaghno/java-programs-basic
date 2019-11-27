import java.net.*;
class ipadd
{
public static void main(String args[])throws Exception
{
InetAddress myIP=InetAddress.getLocalHost();
System.out.println("my ip add is :"+myIP.getHostAddress());

}
}
