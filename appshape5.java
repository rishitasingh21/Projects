import java.awt.*;  //Indian flag
public class appshape5 extends Frame
{
public appshape5()
{
 setBackground(Color.white);
}
public void paint(Graphics g)
{
  
 g.setColor(Color.orange);
 g.fillRect(200,100,200,50);
 g.setColor(Color.white);
 g.fillRect(200,150,200,50);
 g.setColor(Color.blue);
 g.fillOval(275,150,50,50);
 g.setColor(Color.green);
 g.fillRect(200,200,200,50);
 g.setColor(Color.black);
 g.fillRoundRect(190,100,10,500,2,2);
 g.fillRect(150,600,100,30);
 g.fillRect(125,630,150,30);
 g.fillRect(100,660,200,30);
}
public static void main(String args[])
{
 appshape5 d1=new appshape5();
 d1.setSize(500,500);
 d1.setVisible(true);
}
}