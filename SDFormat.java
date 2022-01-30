import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SDFormat {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();

    SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日 E曜日 ahh時mm分ss秒");

    System.out.println(sdf.format(c.getTime())); //指定されたフォーマットで表示
  }
}
