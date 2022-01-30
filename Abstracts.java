class Abstracts {
//抽象クラス 処理の無いメソッドを持つことができるクラス 色々なクラスで共通する名前と用途を持つメソッドを使用したい場合
//継承した場合メソッドをオーバーライドしなければならない
  public static void main(String[] args) {
    Sub s = new Sub();
    s.hyouji();
  }
}

abstract class Super {

  protected abstract void hyouji(); //抽象メソッド
}

class Sub extends Super {

  private void hyouji() { //ルールとしてオーバーライド
    System.out.println("OK");
  }
}
