class Interfaces {

  public static void main(String[] args) {
    ClassTest c = new ClassTest();

    c.hyouji();

    c.keisan();
  }
}

interface InterTest1 {
  public static final int a = 10;

  public abstract void hyouji();
}

interface InterTest2 {
  int b = 20;

  void keisan();
}

class ClassTest implements InterTest1, InterTest2 {

  public void hyouji() {
    System.out.println("表示結果");
  }

  public void keisan() {
    System.out.println(a + b);
  }
}
