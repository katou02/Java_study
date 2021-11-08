import java.util.Date;

public class DateMethod {

  public static void main(String[] args) {
    Date dt = new Date();

    Date dt2 = new Date();

    System.out.println(dt.toString());

    switch (dt.compareTo(dt2)) {
      case 0:
        System.out.println("0です");
        break;
      case 1:
        System.out.println("1です");
        break;
      case -1:
        System.out.println("-1です");
        break;
    }
  }
}
