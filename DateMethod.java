import java.util.Date;

public class DateMethod {

  public static void main(String[] args) {
    Date dt = new Date();

    Date dt2 = new Date();

    System.out.println(dt.toString());//実行した時の日時

    switch (dt.compareTo(dt2)) { //比較
      case 0:
        System.out.println("同じ日付");
        break;
      case 1:
        System.out.println("dtはdt2より未来");
        break;
      case -1:
        System.out.println("dtはdt2より過去");
        break;
    }
  }
}
