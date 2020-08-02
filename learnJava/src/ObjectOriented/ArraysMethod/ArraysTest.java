package ObjectOriented.ArraysMethod;

import java.util.Arrays;

/*
将一个随机字符串中的所有字符升序排列,并倒序打印
 */
public class ArraysTest {
    public static void main(String[] args) {
        String line = "isydhgnkja";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
