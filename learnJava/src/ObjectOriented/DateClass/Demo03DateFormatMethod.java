package ObjectOriented.DateClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 把String转换成Date对象
*/
public class Demo03DateFormatMethod {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = "2020年9月1日";
        Date date = df.parse(str);
        System.out.println(date);
    }
}
