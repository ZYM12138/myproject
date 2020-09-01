package ObjectOriented.DateClass;

import java.util.Calendar;

public class CalendarUtil {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
    }
}
