import java.util.*;
//Arrayは要素数を決めずに宣言できる
public class Main {

  public static void main(String[] args) throws Exception {
    ArrayList<String> a = new ArrayList<String>();
    a.add("商品");

    ArrayList<Integer> b = new ArrayList<Integer>();
    b.add(10);
    b.add(20);

    System.out.println(a);
    System.out.println(b.get(1)); //データの取り出し
  }
}
