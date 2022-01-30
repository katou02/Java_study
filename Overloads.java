class Overloads {
//オーバーロード 同じクラス内で同じメソッド名で引数の、データ型、数、順番、いずれかが異なるもの
  public static void main(String[] args) {
    Kaiin k1 = new Kaiin();

    Kaiin k2 = new Kaiin("B1234");

    System.out.println(k1.Naiyou());

    System.out.println(k2.Naiyou());
  }
}

class Kaiin {

  private String id;
  private String name;

  public Kaiin() {
    this.setId("A0000");
  }

  public Kaiin(String id, String name) {
    this.setId(id);
    this.setName(name);
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String Naiyou() {
    return this.id  + this.name;
  }
}
