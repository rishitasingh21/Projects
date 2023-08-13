//To draw triangle
import java.awt.*;
public class appshape3 extends Frame
{
public appshape3()
{
setBackground(Color.cyan);
}
public void paint(Graphics g)
{
g.drawLine(120, 130, 280, 130);
        g.drawLine(120, 130, 200, 65);
        g.drawLine(200, 65, 280, 130);
}
public static void main(String args[])
{
appshape3 d1=new appshape3();
d1.setSize(500,300);
d1.setVisible(true);
}
}