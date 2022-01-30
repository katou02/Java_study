class IDEnzan {

  public static void main(String[] args) {
    int a = 1;
    int b = 1;

    System.out.println(a++); //1 表示されてからプラス

    System.out.println(++b); //2 プラスされてから表示

    int c = 1;
    int d = 1;

    d = c--;

    System.out.println("c : " + c + " d : " + d);
  }
}
