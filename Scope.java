class Scope {

  String name;

  String methodB() {
    String naiyou = "B";

    name = "メソッドB";

    return naiyou;
  }

  String methodC() {
    name = "メソッドC";

    return name;
  }

  public static void main(String args[]) {
    Scope scope = new Scope();
  }
}
