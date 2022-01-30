import java.util.StringTokenizer;
//,などで分割された文字列を分割する
public class StTokenizer {

  public static void main(String[] args) {
    String str = "A,B,C,D,E";

    StringTokenizer sttoken = new StringTokenizer(str, ",");

    System.out.println(sttoken.countTokens());//5

    while (sttoken.hasMoreTokens()) {
      System.out.println(sttoken.nextToken());
    }
  }
}
