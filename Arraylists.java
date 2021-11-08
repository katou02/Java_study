import java.util.ArrayList;

class Arraylists {

  public static void main(String[] args) {
    ArrayList<String> lst = new ArrayList<String>();

    lst.add("A");
    lst.add("B");
    lst.add("C");

    System.out.println(lst.get(1));

    System.out.println("配列は" + lst.size());

    ArrayList<Integer> rp = new ArrayList<Integer>();

    rp.add(50);
    rp.add(100);

    System.out.println("配列１" + rp.get(1));
  }
}
