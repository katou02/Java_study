import java.io.*;

public class ComInput {

  public static void main(String[] args) {
    String name;

    try {
      System.out.print("商品を入力");

      BufferedReader bfreader = new BufferedReader( //入力させる
        new InputStreamReader(System.in)
      );

      name = bfreader.readLine();

      bfreader.close();

      if ("".equals(name)) {
        System.out.println("入力してください");
      } else {
        System.out.println(name);
      }
    } catch (IOException err) {
      System.out.println("チェックをしてください");
    }
  }
}
