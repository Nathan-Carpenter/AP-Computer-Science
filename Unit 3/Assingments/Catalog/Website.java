public class Website extends Text {
    
    public String URL;

    public Website() {
      super();
      URL = "";
    }
  
    public Website(String t, String a, int y, String u) {
      super(t, a, y);
      URL = u;
    }
  
    public String toString() {
      String str = super.toString();
      return str + ", " + URL;
    }
}
