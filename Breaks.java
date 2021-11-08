class Breaks {

  public static void main(String[] args) {
    System.out.println("break");

    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        break;
      }

      System.out.println(i);
    }

    System.out.println("continue");

    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        continue;
      }

      System.out.println(i);
    }
  }
}
