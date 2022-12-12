public class Point {

    private int x;
    private int y;

    public Point(int x_point,int y_point){
        x = x_point;
        y = y_point;
    }

    public String toString(Point point){
        return "(" + x + "," + y + ")";
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    
}
