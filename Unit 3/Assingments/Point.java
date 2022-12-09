public class Point {

    public static final int y_point = 0;
    private int x;
    private int y;
    public int x_point;

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
