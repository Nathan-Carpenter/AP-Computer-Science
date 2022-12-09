import java.lang.Math.*;

public class LineSegment {
    Point pointOne = new Point(5,3);
    Point pointTwo = new Point(2,4);

    public int getSlope(Point other){
        
        int slopeY = pointOne.getY() - pointTwo.getY();
        int slopeX = pointTwo.getX() - pointOne.getX();

        return slopeY / slopeX;
    }

    public int getDistance(Point other){
        int distance = Math.sqrt();
    }
    
}