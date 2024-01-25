import java.awt.*;
import java.awt.event.*;
public class mousedemo extends Frame implements MouseListener
{
String msg;
int x,y;
public mousedemo()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent e1)
{
x=e1.getX();
y=e1.getY();
msg="Your mouse clicked on "+x+","+y;
repaint();
}
public void mousePressed(MouseEvent e1){}
public void mouseReleased(MouseEvent e1){}
public void mouseEntered(MouseEvent e1){}
public void mouseExited(MouseEvent e1){}
public void paint(Graphics g)
{
g.drawString(msg,x,y);
}
public static void main(String args[])
{
mousedemo d1=new mousedemo();
d1.setSize(300,400);
d1.setVisible(true);
}
}
