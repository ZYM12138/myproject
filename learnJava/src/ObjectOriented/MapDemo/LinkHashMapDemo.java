package ObjectOriented.MapDemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "朱丽倩");
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"的CP是"+value);
        }
    }
}
