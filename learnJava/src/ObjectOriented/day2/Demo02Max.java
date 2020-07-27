package ObjectOriented.day2;

import java.util.Scanner;

public class Demo02Max {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = s1.nextInt();
        System.out.println("请输入第二个整数");
        int b = s1.nextInt();
        System.out.println("请输入第三个整数");
        int c = s1.nextInt();
        int temp = (a>b?a:b);
        int max = (temp>c?temp:c);
        System.out.println("最大值是"+max);
    }
}
