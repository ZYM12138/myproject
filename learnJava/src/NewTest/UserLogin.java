package NewTest;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String username = new String("zhangsan");
        String password = new String("123456");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String inputname = new Scanner(System.in).nextLine();
            System.out.println("请输入密码");
            String inputpassword = new Scanner(System.in).nextLine();
            if (inputname.equals(username)&&inputpassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("用户名或密码错误");
            }
        }

    }
}
