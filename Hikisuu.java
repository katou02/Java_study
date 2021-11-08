class Hikisuu {

  public static void main(String[] args) {
    int a = 10;

    int[] b = { 10, 50, 80 };

    HMethod hm = new HMethod();

    System.out.println("引数1");

    hm.keisan(a);

    System.out.println(a);

    hm.keisan(b);

    System.out.println(b[0]);
  }
}

class HMethod {

  void keisan(int a) {
    a = a + 10;

    System.out.println(a);
  }

  void keisan(int[] b) {
    b[0] = b[0] + 10;

    System.out.println(b[0]);
  }
}
