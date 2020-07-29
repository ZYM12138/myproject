package ObjectOriented.Random;

import java.util.Random;
import java.util.Scanner;

/*
随机生成一个1-100之间的随机数number,玩家猜测一个数字guessNumber,与number比较,
系统提示大了或小了,直到玩家猜中,游戏结束
 */
public class Demo02RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入猜测的数字");
            int guessNumber = s.nextInt();
            if (guessNumber>number){
                System.out.println("猜大了");
            } else if (guessNumber<number){
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }
    }
}
