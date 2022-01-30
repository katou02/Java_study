class Static1 {
//static変数とstaticメソッドはオブジェクトに保持されずに別の場所にまとめて用意される
  public static void main(String[] args) {
    System.out.println(StaticTest.price);

    StaticTest.hyouji();
  }
}

class StaticTest {

  static int price = 500;

  int code = 1001;

  static void hyouji() {
    System.out.println(price);
  }
}
