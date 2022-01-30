public class StringEquals {

  public static void main(String[] args) {
    String name1 = new String("Java");
    String name2 = new String("Java");

    System.out.println((name1 == name2)); //false 参照型だから場所が違う

    System.out.println(name1.equals(name2)); //true 文字列が等しいか

    if ("".equals(name1)) {
      System.out.println("何も入っていない");
    } else {
      System.out.println("入っている");
    }
  }
}
