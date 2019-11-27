import java.applet.Applet;
import java.awt.*;

class conc extends Applet
{
public void init()
{setBackground(Color.cyan);}

public void paint(Graphics g)
{
g.drawString("Concentric circles",10,50);
g.drawOval(50,50,100,100);
g.drawOval(75,75,50,50);
g.drawOval(87,87,25,25);

}
}
/*<applet code="conc.class" width="500" height="500">
</applet>*/
