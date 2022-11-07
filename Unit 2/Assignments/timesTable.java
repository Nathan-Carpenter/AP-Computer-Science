import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
//import java.awt.Point;
//import java.lang.reflect.Array;

//import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Draw = outline
// fill = filled in 

// drawLine( start x, stary y, end x, end y);
// setColor(Color.COLOR);
// drawString("what you want to say", starting x, starting y)
// drawRect(start x, start y, width, height)
// drawArc(start x, start y, end x, end y)

public class timesTable extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        int y = 0;
        int numX = 0;
        int numY = 0;

        g.setColor(Color.LIGHT_GRAY);

        for (x = 0; x <= 1000; x += 25){
            g.drawLine(x,y,x,1000);

            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(numX), x + 5, 20);
            numX += 1;

            g.setColor(Color.LIGHT_GRAY);
            

        }

        for (y = 0; y <= 1000; y += 25){
            g.drawLine(0, y, 1000, y);

            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(numY), 5, y + 20);
            numY += 1;

            g.setColor(Color.LIGHT_GRAY);
        }

        numX = 1;
        numY = 1;
        g.setColor(Color.BLACK);

        for(x = 25; x <= 975; x += 25){
            for (y = 25; y <= 975; y += 25){
                g.drawString(Integer.toString(numX * numY), x + 5, y + 20);

                numY += 1;
            }
            numY = 1;
            numX += 1;
        }

        g.setColor(Color.BLACK);

        


       
   

    }

    public static void main(String[] args) {

        var panel = new timesTable();

        var frame = new JFrame("Graph");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}