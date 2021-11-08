import java.util.Calendar;

public class CalendarMethod {

  public static void main(String[] args) {
    Calendar cl = Calendar.getInstance();

    System.out.println(cl.getTime());

    cl.set(2010, 7, 10);

    System.out.println(cl.getTime());

    System.out.println((cl.get(Calendar.MONTH) + 1));

    cl.add(Calendar.DATE, 1);

    System.out.println(cl.getTime());
  }
}
