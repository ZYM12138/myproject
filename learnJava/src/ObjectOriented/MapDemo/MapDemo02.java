package ObjectOriented.MapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Map集合不能直接使用迭代器或者foreach进行遍历。但是转成Set之后就可以使用了。
public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map集合对象
        HashMap<String,String> map = new HashMap<>();
        // 添加元素到集合
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");


        // 获取 所有的 entry对象  entrySet
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的CP是"+value);

        }
    }
}
