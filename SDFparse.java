import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SDFparse {

  public static void main(String[] args) {
    try {
      SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");

      df.setLenient(false);

      df.parse("2015/03/45");
    } catch (ParseException err) {
      System.out.println("例外です");
    }
  }
}
