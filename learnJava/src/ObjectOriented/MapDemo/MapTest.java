package ObjectOriented.MapDemo;

import java.util.HashMap;
import java.util.Scanner;

//计算一个字符串中字符出现的次数
public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        String line = new Scanner(System.in).nextLine();
        findChar(line);
    }

    public static void findChar(String line){
        //创建一个集合，存储字符和字符出现的次数
        HashMap<Character,Integer> hashMap = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //字符第一次出现
            if (!hashMap.containsKey(c)){
                hashMap.put(c,1);
            } else {
                Integer count = hashMap.get(c);
                hashMap.put(c,count+1);
            }
        }
        System.out.println(hashMap);
    }
}
