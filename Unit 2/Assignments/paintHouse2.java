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

public class paintHouse2 extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.CYAN.brighter().brighter());
        g.fillRect(-100, -100, 700, 700);

        g.setColor(Color.GREEN.darker().darker());
        g.fillOval(-300, 200, 1000, 300);

        g.setColor(Color.WHITE.brighter());
        g.fillOval(225, 50, 125, 30);
        g.fillOval(270, 30, 65, 50);

        g.setColor(Color.LIGHT_GRAY);
        // g.fillOval(50, 50, 70, 50);
        g.fillRect(75, 75, 100, 150);
        g.fillRect(175, 150, 50, 75);

        int[] xPoints1 = {60, 125, 190};
        int[] yPoints1 = {75, 30, 75};

        int[] xPoints2 = {175, 175, 240};
        int[] yPoints2 = {125, 150, 150};

        g.setColor(Color.BLACK);
        g.fillPolygon(xPoints1, yPoints1, 3);
        g.fillPolygon(xPoints2, yPoints2, 3);

        g.setColor(Color.DARK_GRAY);
        g.fillRect(115, 175, 25, 50);

        g.setColor(Color.ORANGE);
        g.fillOval(130, 200, 5, 5);

        g.setColor(Color.CYAN);
        g.fillRect(108, 98, 15, 15);
        g.fillRect(127, 98, 15, 15);
        g.fillRect(127, 117,15, 15);
        g.fillRect(108 ,117,15, 15);

        g.fillRect(165, 175, 15, 15);
        g.fillRect(184, 175, 15, 15);
        g.fillRect(165, 194, 15, 15);
        g.fillRect(184, 194, 15, 15);

        g.setColor(Color.ORANGE.darker());
        g.drawArc(220, 200, 8, 75, 100, 75);

        g.setColor(Color.GREEN.darker());
        g.fillOval(210, 180, 25, 25);

        g.setColor(Color.BLACK);
        g.drawOval(275, 200, 25, 25);
        g.drawOval(325, 200, 25, 25);

        g.setColor(Color.RED);
        g.drawLine(337, 212, 315, 212);
        g.drawLine(337, 212, 325, 190);
        g.drawLine(315, 212, 325, 190);

        g.drawLine(287, 212, 295, 190);
        g.drawLine(285, 180, 315, 212);
        g.drawLine(295, 190, 325, 190);

        g.drawLine(270, 180, 300, 180);

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

        var panel = new paintHouse2();

        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }
}