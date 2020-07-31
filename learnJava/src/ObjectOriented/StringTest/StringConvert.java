package ObjectOriented.StringTest;
/*
public char[] toCharArray 将字符串拆分为字符数组作为返回值
Public byte[] getByes 获得当前字符串底层的字节数组
public String replace(CharSequence oldString,CharSequence newString)
将老字符串替换成新字符串，返回替换后的新字符串
 */
public class StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=================");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str = "How do you do?";
        String str1 = str.replace("o", "*");
        System.out.println(str);
        System.out.println(str1);

    }
}
