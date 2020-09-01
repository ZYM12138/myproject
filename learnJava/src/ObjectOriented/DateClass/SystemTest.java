package ObjectOriented.DateClass;
//验证for循环打印数字1-9999所需要使用的时间（毫秒）
public class SystemTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时（毫秒）"+(end-start));
    }
}
