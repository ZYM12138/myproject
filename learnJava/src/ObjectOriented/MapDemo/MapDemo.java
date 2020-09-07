package ObjectOriented.MapDemo;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        //创建 map对象
        HashMap<String,String> hashMap = new HashMap<>();
        //使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；
        //
        //若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的值，替换成指定的新值。
        hashMap.put("黄晓明","杨颖");
        hashMap.put("奔驰","宝马");
        System.out.println(hashMap.remove("黄晓明"));
        System.out.println(hashMap);

        System.out.println(hashMap.get("奔驰"));
    }
}
