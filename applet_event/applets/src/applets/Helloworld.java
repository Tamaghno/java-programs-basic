package applets;

import java.applet.Applet;
import java.awt.*;
class Helloworld extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("hello",150,150);
    }
}
/*<applet code="Helloworld" width="300" height="400"></applet>*/
