package ObjectOriented.ListSet;

import java.util.HashSet;
//重复的元素set集合不存储。
public class HashSetDemo {
    public static void main(String[] args) {
        //创建 Set集合
        HashSet<String> hashSet = new HashSet<>();
        //添加元素
        hashSet.add("321");
        hashSet.add("123");
        hashSet.add("213");
        hashSet.add(new String("123"));
        //遍历
        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}
