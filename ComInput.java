import java.io.*;

public class ComInput {

  public static void main(String[] args) {
    String name;

    try {
      System.out.print("tryを実行");

      BufferedReader bfreader = new BufferedReader(
        new InputStreamReader(System.in)
      );

      name = bfreader.readLine();

      bfreader.close();

      if ("".equals(name)) {
        System.out.println("問題ありません");
      } else {
        System.out.println(name);
      }
    } catch (IOException err) {
      System.out.println("チェックをしてください");
    }
  }
}
