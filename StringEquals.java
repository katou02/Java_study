public class StringEquals {

  public static void main(String[] args) {
    String name1 = new String("田中");
    String name2 = new String("山田");

    System.out.println((name1 == name2));

    System.out.println(name1.equals(name2));

    if ("".equals(name1)) {
      System.out.println("処理1");
    } else {
      System.out.println("処理2");
    }
  }
}
