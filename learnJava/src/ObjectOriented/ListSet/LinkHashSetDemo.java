package ObjectOriented.ListSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("bbb");
        set.add("ccc");
        set.add("aaa");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
