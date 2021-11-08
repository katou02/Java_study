class Tajigen {

  public static void main(String[] args) {
    int[][] a = new int[4][3];

    a[1][2] = 500;

    int[][] b = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };

    int[][] c = { { 10, 20, 30, 40 }, { 50, 60 }, { 70, 80, 90 } };

    System.out.println("a[1][2]=" + a[1][2]);
    System.out.println("b[0][2]=" + b[0][2]);
    System.out.println("c[1][0]=" + c[1][0]);
  }
}
