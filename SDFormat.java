import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SDFormat {

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();

    SimpleDateFormat sdf = new SimpleDateFormat("2021/11/02");

    System.out.println(sdf.format(c.getTime()));
  }
}
