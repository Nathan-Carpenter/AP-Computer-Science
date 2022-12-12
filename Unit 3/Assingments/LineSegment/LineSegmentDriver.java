package LineSegment;
import java.util.*;

public class LineSegmentDriver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" enter the x value of the first point");
        int x1 = Integer.parseInt(keyboard.nextLine());

        System.out.println(" enter the y value of the first point");
        int y1 = Integer.parseInt(keyboard.nextLine());

        System.out.println(" enter the x value of the second point");
        int x2 = Integer.parseInt(keyboard.nextLine());

        System.out.println(" enter the y value of the second point");
        int y2 = Integer.parseInt(keyboard.nextLine());
    
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);     

        LineSegment line = new LineSegment(point1, point2);

        System.out.println(line.toString());

        System.out.println(line.getSlope());
        
        System.out.println(line.getDistance());

        keyboard.close();
        

        
      
    }
    
}
