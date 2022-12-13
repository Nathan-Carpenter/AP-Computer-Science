public class Article extends Text {

  public String periodical;

  public Article() {
    super();
    periodical = " ";
  }

  public Article(String t, String a, int y, String p) {
    super(t,a,y);
    periodical = p;
  }

  public String toString() {
    String str = super.toString(); 
    return str + ", " + periodical;
  }

}
