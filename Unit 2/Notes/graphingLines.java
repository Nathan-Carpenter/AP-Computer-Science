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

public class graphingLines extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 0;
        int y = 0;

        g.setColor(Color.LIGHT_GRAY);

        for (x = 0; x <= 500; x += 25){
            g.drawLine(x,y,x,500);
        }

        for (y = 0; y <= 500; y += 25){
            g.drawLine(0, y, 500, y);
        }

        g.setColor(Color.BLACK);
        g.drawLine(250, 0, 250, 500);
        g.drawLine(0, 250, 500, 250);
        g.setColor(Color.RED);

        int prevX = 0;
        int prevY = 250;

        for(x = 0; x <= 500; x += 1){
            y = (int) (250-(x*x)/20);
            

            // y -= xTRUE * xTRUE;

         
            //g.fillOval( x + 250 , y, 5, 5);
            //g.fillOval( -x + 250, y, 5, 5);
            g.drawLine(x + 250, y, prevX + 250, prevY  );
            g.drawLine(-x + 250, y, -prevX + 250, prevY);
            prevX = x;
            prevY = y;
            
        }

        

       
   

    }

    public static void main(String[] args) {

        var panel = new graphingLines();

        var frame = new JFrame("Graph");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}