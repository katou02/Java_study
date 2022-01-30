import java.io.*;
import java.util.StringTokenizer;

class OutputFile {

  public static void main(String[] args) {
    String strline;

    try {
      BufferedReader bfreader = new BufferedReader(
        new FileReader("address.txt")
      );

      while ((strline = bfreader.readLine()) != null) { //1行づつ取り出す
        StringTokenizer sttoken = new StringTokenizer(strline, ","); //,を境に分割

        System.out.print(sttoken.nextToken());//1つ目のトークン

        System.out.println(sttoken.nextToken());//2つめのトークン
      }

      bfreader.close();
    } catch (FileNotFoundException err) {
      System.out.println("エラー1");
    } catch (IOException err) {
      System.out.println("エラー2);
    }
  }
}
