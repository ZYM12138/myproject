package ObjectOriented.StringTest;

import java.util.Scanner;

/*
键盘录入一个字符串,统计字符串中大小写字母及数字字符个数
 */
public class StringTest2 {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        str = sc.next();
        System.out.println(sumCount(str));
    }
    public static String sumCount(String str){
        int UpperCount = 0;
        int LowerCount = 0;
        int NumberCount = 0;
        int OtherCount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A'&&chars[i]<='Z'){
                UpperCount++;
            } else if (chars[i]>='a'&&chars[i]<='z'){
                LowerCount++;
            } else if (chars[i]>='0'&&chars[i]<='9'){
                NumberCount++;
            } else {
                OtherCount++;
            }
        }
        String s = "大写字母个数为："+UpperCount+"小写字母个数为："+LowerCount+"数字个数为："+NumberCount+"其他字符个数为"+OtherCount;
        return s;
    }
}
