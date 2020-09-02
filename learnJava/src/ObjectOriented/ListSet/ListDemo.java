package ObjectOriented.ListSet;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        System.out.println(list);
        System.out.println("增加元素");
        list.add(0,"张三");
        System.out.println(list);
        System.out.println("删除元素");
        list.remove(2);
        System.out.println(list);
        System.out.println("修改元素");
        list.set(0,"李四");
        System.out.println(list);
        System.out.println("遍历元素");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("foreach遍历元素");
        for (String string :list) {
            System.out.println(string);
        }
    }
}
