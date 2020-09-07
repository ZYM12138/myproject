package ObjectOriented.MapDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //1,创建Hashmap集合对象。
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("张三",18),"北京");
        map.put(new Student("李四",19),"上海");
        map.put(new Student("王五",20),"深圳");

        //3,取出元素。键找值方式
        Set<Student> set = map.keySet();
        for (Student student:set){
            String value = map.get(student);
            System.out.println(student+"的住址是"+value);
        }
    }
}
