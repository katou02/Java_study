import java.util.StringTokenizer;

public class StTokenizer {

  public static void main(String[] args) {
    String str = "ST";

    StringTokenizer sttoken = new StringTokenizer(str, ",");

    System.out.println(sttoken.countTokens());

    while (sttoken.hasMoreTokens()) {
      System.out.println(sttoken.nextToken());
    }
  }
}
