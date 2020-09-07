package ObjectOriented.MapDemo;

import java.util.HashMap;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String,String> hashMap = new HashMap<>();
        //添加元素到集合
        hashMap.put("胡歌", "霍建华");
        hashMap.put("郭德纲", "于谦");
        hashMap.put("薛之谦", "大张伟");
        //获取所有的键  获取键集
        Set<String> keys = hashMap.keySet();
        for (String key:keys){
            String value = hashMap.get(key);
            System.out.println(key+"的CP是"+value);
        }
    }
}
