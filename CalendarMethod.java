import java.util.Calendar;

public class CalendarMethod {

  public static void main(String[] args) {
    Calendar cl = Calendar.getInstance();

    System.out.println(cl.getTime()); //日時を返す

    cl.set(2010, 7, 10); //日付を設定

    System.out.println(cl.getTime());

    System.out.println((cl.get(Calendar.MONTH) + 1)); //月にプラス1

    cl.add(Calendar.DATE, 1); //日だけ返す

    System.out.println(cl.getTime()); //2010/8/10
  }
}
