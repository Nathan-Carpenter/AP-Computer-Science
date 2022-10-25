import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.Point;
// import java.lang.reflect.Array;

// import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Draw = outline
// fill = filled in 

// drawLine( start x, stary y, end x, end y);
// setColor(Color.COLOR);
// drawString("what you want to say", starting x, starting y)
// drawRect(start x, start y, width, height)
// drawArc(start x, start y, end x, end y)

public class paintHouse extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        // g.fillOval(50, 50, 70, 50);
        g.fillRect(25, 75, 100, 150);
        g.fillRect(125, 150, 50, 75);

        int[] xPoints1 = {10, 75, 140};
        int[] yPoints1 = {75, 30, 75};

        int[] xPoints2 = {125, 125, 190};
        int[] yPoints2 = {125, 150, 150};

        g.setColor(Color.BLACK);
        g.fillPolygon(xPoints1, yPoints1, 3);
        g.fillPolygon(xPoints2, yPoints2, 3);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(65, 175, 25, 50);

        g.setColor(Color.ORANGE);
        g.fillOval(80, 200, 5, 5);

        g.setColor(Color.CYAN);
        g.fillRect(58, 98, 15, 15);
        g.fillRect(77, 98, 15, 15);
        g.fillRect(77, 117,15, 15);
        g.fillRect(58 ,117,15, 15);

        g.fillRect(115, 175, 15, 15);
        g.fillRect(134, 175, 15, 15);
        g.fillRect(115, 194, 15, 15);
        g.fillRect(134, 194, 15, 15);

        g.setColor(Color.ORANGE.darker());
        g.drawArc(170, 200, 8, 75, 100, 75);

        g.setColor(Color.GREEN.darker());
        g.fillOval(160, 180, 25, 25);

        g.setColor(Color.BLACK);
        g.drawOval(225, 200, 25, 25);
        g.drawOval(275, 200, 25, 25);

        g.setColor(Color.RED);
        g.drawLine(287, 212, 265, 212);
        g.drawLine(287, 212, 275, 190);
        g.drawLine(265, 212, 275, 190);

        g.drawLine(237, 212, 245, 190);
        g.drawLine(235, 180, 265, 212);
        g.drawLine(245, 190, 275, 190);

        g.drawLine(220, 180, 250, 180);

        g.setColor(Color.BLACK);
        
        int x = 0;
        String num = Integer.toString(x);

        while(x <= 400){
            g.drawString(num, 5, x);
            x += 25;
            num = Integer.toString(x);
        }

        int y = 0;
        String num2 = Integer.toString(y);

        while(y <= 300){
            g.drawString(num2, y, 10);
            y += 25;
            num2 = Integer.toString(y);
        }
    }

    public static void main(String[] args) {

        var panel = new paintHouse();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}