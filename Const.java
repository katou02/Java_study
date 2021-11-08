class Const {

  public static void main(String[] args) {
    Hinban k1 = new Hinban("コスト");

    System.out.println(k1.getName());
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
