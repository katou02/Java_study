import java.io.*;
import java.util.StringTokenizer;

class OutputFile {

  public static void main(String[] args) {
    String strline;

    try {
      BufferedReader bfreader = new BufferedReader(
        new FileReader("address.txt")
      );

      while ((strline = bfreader.readLine()) != null) {
        StringTokenizer sttoken = new StringTokenizer(strline, ",");

        System.out.print(sttoken.nextToken());

        System.out.println(sttoken.nextToken());
      }

      bfreader.close();
    } catch (FileNotFoundException err) {
      System.out.println("エラー1");
    } catch (IOException err) {
      System.out.println("エラー2);
    }
  }
}
