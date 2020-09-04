package ObjectOriented.ListSet;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("123");
        linkedList.addFirst("456");
        linkedList.addFirst("789");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        while (!linkedList.isEmpty()){
            System.out.println(linkedList.pop());//弹出集合中的栈顶元素
        }
        System.out.println(linkedList);
    }
}
