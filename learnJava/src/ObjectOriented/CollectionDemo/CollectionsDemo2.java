package ObjectOriented.CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cba");
        list.add("aba");
        list.add("sba");
        list.add("nba");
        Collections.sort(list);
        System.out.println(list);
    }
}
