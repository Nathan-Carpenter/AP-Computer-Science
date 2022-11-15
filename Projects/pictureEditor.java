import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;




public class pictureEditor extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        BufferedImage redHead = null;
        try{
            redHead = ImageIO.read(new File("redHead.JPG"));
        }
        catch(IOException e){}
        g.drawImage(redHead, 600, 10, 510, 765, getBackground(), getFocusCycleRootAncestor());

        g.setColor(Color.BLACK);

        int[] xPoints1 = {850,850,1110};
        int[] yPoints1 = {350,400,430};

        g.fillPolygon(xPoints1, yPoints1, 3);

        int[] xPoints2 = {850,850,590};
        int[] yPoints2 = {350,400,430};

        g.fillPolygon(xPoints2, yPoints2, 3);

        g.fillRect(800,295,100,10);

        g.setColor(Color.RED);
        g.fillRect(735,280,100,10);
        g.fillRect(865,280,100,10);

        g.setColor(Color.ORANGE);
        g.fillRect(735,290,100,10);
        g.fillRect(865,290,100,10);

        g.setColor(Color.YELLOW);
        g.fillRect(735,300,100,10);
        g.fillRect(865,300,100,10);

        g.setColor(Color.GREEN);
        g.fillRect(735,310,100,10);
        g.fillRect(865,310,100,10);

        g.setColor(Color.BLUE);
        g.fillRect(735,320,100,10);
        g.fillRect(865,320,100,10);

        g.setColor(Color.WHITE);

        int[] xPoints3 = {750,770,790,770};
        int[] yPoints3 = {330,330,280,280};

        g.fillPolygon(xPoints3, yPoints3, 4);

        int[] xPoints4 = {790,800,820,810};
        int[] yPoints4 = {330,330,280,280};

        g.fillPolygon(xPoints4, yPoints4, 4);

        int[] xPoints5 = {880,900,920,900};
        int[] yPoints5 = {330,330,280,280};

        g.fillPolygon(xPoints5, yPoints5, 4);

        int[] xPoints6 = {920,930,950,940};
        int[] yPoints6 = {330,330,280,280};

        g.fillPolygon(xPoints6, yPoints6, 4);

        g.setColor(Color.BLACK);
        g.drawRect(735, 280, 100, 50);
        g.drawRect(865, 280, 100, 50);


    }

    public static void main(String[] args) {

       var panel = new pictureEditor();

       var frame = new JFrame("Specimen");
       frame.setSize(4000, 4000);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(panel, BorderLayout.CENTER);
       frame.setVisible(true);

    }
}