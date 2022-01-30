import java.io.*;

class Throws {

  public static void main(String[] args) {
    try {
      ThrowsTest t = new ThrowsTest();

      t.yomikomi();//ここに転送される
    } catch (FileNotFoundException err) {
      System.out.println("発見しました");
    }
  }
}

class ThrowsTest {

  void yomikomi() throws FileNotFoundException {
    FileReader f = new FileReader("none.txt");
    //ここで例外が発生したら呼び出し元に例外オブジェクトを転送
  }
}
