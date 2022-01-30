import java.util.ArrayList;
//クラスライブラリ よく使用される機能を持つクラス
// Arrayクラスリストをインポート
class Arraylists {

  public static void main(String[] args) {
    ArrayList<String> lst = new ArrayList<String>();

    lst.add("A");
    lst.add("B");
    lst.add("C");

    System.out.println(lst.get(1));

    System.out.println("配列は" + lst.size());
//ラッパークラス 基本データ型を参照型にする
//参照型=データそのものを保持するのではなく、データの置き場所を保持する
    ArrayList<Integer> rp = new ArrayList<Integer>();

    rp.add(50);
    rp.add(100);

    System.out.println("配列１" + rp.get(1));
  }
}
