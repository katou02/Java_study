class Overrides {

  public static void main(String[] args) {
    RideSub Rs = new RideSub();

    System.out.println(Rs.Naiyou());
  }
}

class RideSuper {

  private String id;
  private String name;

  public RideSuper() {
    this.setId("A0000");
    this.setName("B0000");
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String Naiyou() {
    return "ID:" + this.id;
  }
}

class RideSub extends RideSuper {

  public String Naiyou() {
    return this.id + this.name;
  }
}
