package Rectangle;
public class Rectangle {

  // Attributes
  int length;
  int width;

  // Default Constructor
  public Rectangle() {
    this.length = 1;
    this.width = 1;
  }

  // Constructor
  public Rectangle(int l, int w) {
    this.length = l;
    this.width = w;
  }

  // area method with no parameters
  public int area() {
    int area = length * width;
    return area;
  }

  // perimeter method with no parameters
  public int perimeter() {
    int perimeter = (length * 2) + (width * 2);
    return perimeter;
  }

  // method with parameters
  public void scale(double factor) {
    length = (int)(length * factor);
    width = (int)(width * factor);
  }

  public String toString() {
    return length + " long, " + width + " wide rectangle";
  }

}
