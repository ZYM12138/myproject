package ObjectOriented.day2;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = s1.nextInt();
        System.out.println("请输入第二个整数");
        int b = s1.nextInt();
        System.out.println("结果是"+(a+b));
    }
}
