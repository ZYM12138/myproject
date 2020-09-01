package ObjectOriented.DateClass;

import java.util.Calendar;
import java.util.Date;
/*
 在Calendar类中，月份的表示是以0-11代表1-12月。
 */
public class CalendarMethod {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //打印当前年份
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR,2019);
        //打印修改后年份
        System.out.println("==========");
        System.out.println(calendar.get(Calendar.YEAR));
        //打印当前月份
        System.out.println("==========");
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.MONTH,2);
        //打印增加后月份
        System.out.println("==========");
        System.out.println(calendar.get(Calendar.MONTH));

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
