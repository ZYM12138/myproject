package ObjectOriented.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01Collection {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用多态形式
        Collection<String> coll = new ArrayList<String>();
        // 使用方法
        // 添加功能  boolean  add(String s)
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);

        // boolean contains(E e) 判断o是否在集合中存在
        System.out.println("李四是否在集合中"+coll.contains("李四"));
        //boolean remove(E e) 删除在集合中的o元素
        System.out.println("删除张三"+coll.remove("张三"));
        System.out.println("删除后的集合"+coll);

        // size() 集合中有几个元素
        System.out.println("集合中有"+coll.size()+"个元素");

        // Object[] toArray()转换成一个Object数组
        Object[] objects = coll.toArray();
        // 遍历数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        // void  clear() 清空集合
        coll.clear();
        System.out.println("集合中的内容为"+coll);
        System.out.println(coll.isEmpty());
    }
}
