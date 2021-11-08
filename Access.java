class Access {

  public static void main(String[] args) {
    Kataban k1 = new Kataban();

    k1.setKataban("AE123");
    System.out.println(k1.getKataban());
    k1.setPrice(2000);
    System.out.println(k1.kataban);
  }
}

class Kataban {

  private String kataban;
  private int price;

  public void setKataban(String kataban) {
    this.kataban = kataban;
  }

  private void setPrice(int price) {
    this.price = price;
  }

  public String getKataban() {
    return this.kataban;
  }
}
