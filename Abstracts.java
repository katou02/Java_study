class Abstracts {

  public static void main(String[] args) {
    Sub s = new Sub();
    s.hyouji();
  }
}

abstract class Super {

  protected abstract void hyouji();
}

class Sub extends Super {

  private void hyouji() {
    System.out.println("OK");
  }
}
