package ObjectOriented.MathMethod;
/*
public static double abs(double a) ：返回 double 值的绝对值。
public static double ceil(double a) ：返回大于等于参数的最小的整数。
public static double floor(double a) ：返回小于等于参数最大的整数。
public static long round(double a) ：返回最接近参数的 long。(相当于四舍五入方法)
请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
 */
public class MathTest {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int count = 0;
        for (double i = Math.ceil(min); i <= max; i++) {
            if (Math.abs(i)>6||Math.abs(i)<2){
                count++;
            }
        }
        System.out.println(count);
    }
}
