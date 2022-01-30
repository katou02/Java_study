class Const {

  public static void main(String[] args) {
    Hinban k1 = new Hinban("コスト");

    System.out.println(k1.getName());
  }
}

class Hinban {

  private String name;
  //コンストラクタ インスタンス変数が作成された時に実行される
  public Hinban(String name) {
    this.setName(name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
