package LineSegment;
//import java.lang.Math.*;

public class LineSegment {
    private Point pointOne;
    private Point pointTwo;

    public LineSegment(Point one, Point two){
        pointOne = one;
        pointTwo = two;
    }


    public String getSlope(){
        
        int slopeY = pointTwo.getY() - pointOne.getY();
        int slopeX = pointTwo.getX() - pointOne.getX();

        if (slopeX < 0){
            slopeX *= -1;
            slopeY *= -1;
        }
        return slopeY + "/" + slopeX;
    }

    public double getDistance(){
        double distance = Math.sqrt(Math.pow(pointTwo.getX() - pointOne.getX(), 2) + Math.pow(pointTwo.getY() - pointOne.getY(), 2));
        return distance;
    }

    public String toString(){
        return "(" + pointOne.getX() + "," + pointOne.getY() + "),(" + pointTwo.getX() + "," + pointTwo.getY() + ")";
    }
    
}