import java.util.Scanner;
import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawingTest extends JComponent{
    public static void main(String[] args){
        // Making a canvas to draw on, called a Frame
        JFrame frame = new JFrame();

        //   Drawing shapes = new Drawing();

        // Making the canvas size 200px by 200px
        frame.setSize(200,200);

        // Making the canvas title "Drawing Test"
        frame.setTitle("Drawing Test");

        // Making the canvas Exit when it's closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        // Making the frame visible
        frame.setVisible(true);
        


    }

    public void paint(Graphics g){
        g.drawLine(0,0,100,100);
       
    }
}
