//Lifecycle of an applet
import java.awt.*;

public class AppCycle extends Frame {


    public AppCycle()
 {
        setBackground(Color.WHITE);
        
    }


        public void paint(Graphics g)
{
               
             
                g.setColor(Color.yellow);
                g.fillOval(100, 180, 150, 150);
                g.setColor(Color.BLACK);
                g.drawString("Applet Started", 150, 250);

                g.setColor(Color.RED);
                g.fillOval(250, 180, 150, 150);
                g.setColor(Color.BLACK);
                g.drawString("Applet Paint", 290, 250);

                g.setColor(Color.GREEN);
                g.fillOval(250, 30, 150, 150);
                g.setColor(Color.BLACK);
                g.drawString("Applet Initiated ", 300, 100);

                g.setColor(Color.BLUE);
                g.fillOval(248, 330, 150, 150);
                g.setColor(Color.BLACK);
                g.drawString("Applet Blocked", 280, 400);

                g.setColor(Color.PINK);
                g.fillOval(400, 180, 150, 150);
                g.setColor(Color.BLACK);
                g.drawString("Applet Dead", 440, 250);

            
        }

            public static void main(String[] args)
        {
            AppCycle d1 = new AppCycle();
            d1.setSize(500, 500);
            d1.setTitle("LIFECYCLE OF APPLET");
            d1.setVisible(true);
        }
    }

