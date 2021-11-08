class Reigai {

  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);

      int b = Integer.parseInt(args[1]);

      System.out.println(a / b);
    } catch (NumberFormatException err) {

      System.out.println();

      System.out.println(err.getMessage());
    } catch (ArithmeticException err) {

      System.out.println();

      System.out.println(err.getMessage());
    } catch (Exception err) {
      System.out.println(err.getMessage());
    }
  }
}
