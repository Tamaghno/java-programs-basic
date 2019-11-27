import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class buttondemo extends Applet implements ActionListener
{
Button yes,no,maybe;
String msg="";

public void init()
{
setBackground(Color.yellow);
yes=new Button("yes");
no=new Button("no");
maybe=new Button("maybe");

add(yes);
add(no);
add(maybe);

yes.addActionListener(this);
no.addActionListener(this);
maybe.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("yes"))
msg="you've pressed yes";
if(str.equals("no"))
msg="you've pressed no";
if(str.equals("maybe"))
msg="you've pressed maybe";
}

public void paint(Graphics g)
{
g.drawString(msg,150,150);
g.setColor(Color.black);
repaint();
}


}
/*<applet code="buttondemo.class" width="500" height="50">
</applet>*/
