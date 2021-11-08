class Keishou {

  public static void main(String[] args) {
    Hinbankeishou hk = new Hinbankeishou("品番", 2500);

    System.out.println(hk.getName());

    System.out.println(hk.getPrice());
  }
}

class Hinban {

  private String name;

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

class Hinbankeishou extends Hinban {

  private int price;

  public Hinbankeishou(String name, int price) {
    super(name);
    this.setPrice(price);
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }
}
