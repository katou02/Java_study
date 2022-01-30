import java.io.*;

public class InputFile {

  public static void main(String[] args) {
    String name;
    String address;

    try {
      BufferedReader bfreader = new BufferedReader(
        new InputStreamReader(System.in)
      );

      name = bfreader.readLine(); //1行づつ読み込む
      address = bfreader.readLine();//1行づつ読み込む

      if ("".equals(name) || "".equals(address)) {
        System.out.println("入力してください");
        System.exit(1);//終了
      } else {
        try {
          BufferedWriter bfwriter = new BufferedWriter(
            new FileWriter("address.txt", true)
          );
          bfwriter.write(name + "," + address); //書き込む
          bfwriter.newLine();//改行
          bfwriter.close();
        } catch (IOException err) {
          System.out.println("エラーです");
        } catch (Exception err) {
          System.out.println(err.getMessage());
        }
        bfreader.close();
      }
    } catch (IOException err) {} catch (Exception err) {
      System.out.println(err.getMessage());
    }
  }
}
