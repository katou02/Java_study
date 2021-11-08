class Labels {

  public static void main(String[] args) {
    loop1:for (int a = 0; a < 3; a++) {
      for (int b = 0; b < 3; b++) {
        if (b == 1) {
          break loop1;
        }

        System.out.println("a=" + a + " b=" + b);
      }
    }

    System.out.println("continue�̏ꍇ");

    loop2:for (int a = 0; a < 3; a++) {
      for (int b = 0; b < 3; b++) {
        if (b == 1) {
          continue loop2;
        }

        System.out.println("a=" + a + " b=" + b);
      }
    }
  }
}
