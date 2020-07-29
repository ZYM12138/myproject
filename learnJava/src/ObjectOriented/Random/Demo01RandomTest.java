package ObjectOriented.Random;

import java.util.Random;

//获取1-n之间的随机数，包含n,n取20
public class Demo01RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(20) + 1;
        System.out.println(num);
    }
}
