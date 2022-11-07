import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

// import java.awt.Point;
// import java.lang.reflect.Array;

// import javax.swing.SwingUtilities;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.Timer;

// Draw = outline
// fill = filled in 

// drawLine( start x, stary y, end x, end y);
// setColor(Color.COLOR);
// drawString("what you want to say", starting x, starting y)
// drawRect(start x, start y, width, height)
// drawArc(start x, start y, end x, end y)

public class Jumper2 extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int xValue = 10;

        g.setColor(Color.BLACK);
        g.fillRect(xValue, 500, 50, 50);

        xValue ++;

        repaint();

       
    }

    public static void main(String[] args) {

        var panel = new Jumper2();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(1920, 1080);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    public static void TimeDelay(int x){
        try{
            Thread.sleep(x);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}