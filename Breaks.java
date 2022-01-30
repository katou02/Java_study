class Breaks {

  public static void main(String[] args) {
    System.out.println("break");

    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        break; //ループを抜ける
      }

      System.out.println(i);
    }

    System.out.println("continue");

    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        continue; //飛ばす
      }

      System.out.println(i);
    }
  }
}
