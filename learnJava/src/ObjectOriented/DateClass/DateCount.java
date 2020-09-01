package ObjectOriented.DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCount {
    public static void main(String[] args) throws Exception {
        // 获取出生日期,键盘输入
        System.out.println("请输入出生日期 格式 yyyy-MM-dd");
        String birthdayString = new Scanner(System.in).next();
        // 将字符串日期,转成Date对象
        // 创建SimpleDateFormat对象,写日期模式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = simpleDateFormat.parse(birthdayString);
        // 获取今天的日期对象
        Date todayDate = new Date();
        // 将两个日期转成毫秒值,Date类的方法getTime
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long second = todaySecond-birthdaySecond;
        if (second < 0){
            System.out.println("还没出生呢");
        } else {
            System.out.println(second/1000/60/60/24);
        }
    }
}
