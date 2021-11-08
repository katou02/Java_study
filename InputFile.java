import java.io.*;

public class InputFile {

  public static void main(String[] args) {
    String name;
    String address;

    try {
      BufferedReader bfreader = new BufferedReader(
        new InputStreamReader(System.in)
      );

      name = bfreader.readLine();
      address = bfreader.readLine();

      if ("".equals(name) || "".equals(address)) {
        System.exit(1);
      } else {
        try {
          BufferedWriter bfwriter = new BufferedWriter(
            new FileWriter("address.txt", true)
          );
          bfwriter.write(name + "," + address);
          bfwriter.newLine();
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
