package ObjectOriented.CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
//tips:泛型不存在继承关系 Collection<Object> list = new ArrayList<String>();这种是错误的。
public class GenericDemo02 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        getElement(collection);
        Collection<String> stringCollection = new ArrayList<>();
        getElement(stringCollection);
    }
    public static void getElement(Collection<?> collection){}
    //？代表可以接收任意类型
}
