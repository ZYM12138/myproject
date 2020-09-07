package ObjectOriented.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,5,222,1,2);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
