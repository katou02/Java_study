class Reigai {
//実行時のエラー
//例外処理 例外が発生した時の処理
  public static void main(String[] args) {
    try {//例外が起きる可能性のある処理
      int a = Integer.parseInt(args[0]);

      int b = Integer.parseInt(args[1]);

      System.out.println(a / b);
    } catch (NumberFormatException err) { //数値に変換できない時
//例外が発生した時の処理
      System.out.println("数値を入れてください");
      System.out.println();
      System.out.println(err.getMessage());
    } catch (ArithmeticException err) { //0で割り算 

      System.out.println("0で割ることはできません");
      System.out.println();
      System.out.println(err.getMessage());
    } catch (Exception err) {//全ての例外
      System.out.println(err.getMessage());
    }
  }
}
