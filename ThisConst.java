class ThisConst {
//this=自分自身
  public static void main(String[] args) {
    ConstTest c = new ConstTest("B000");
  }
}

class ConstTest {

  String id;
  String name;

  ConstTest() {
    this.setId("A0000");//2
  }

  ConstTest(String name) {
    this();//1
    this.setName(name);

    System.out.print("id:" + id + " name:" + name);
  }

  void setId(String id) {
    this.id = id;
  }

  void setName(String name) {
    this.name = name;
  }
}
