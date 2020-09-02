package ObjectOriented.CollectionDemo;

public class GenericClassDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> my = new MyGenericClass<>();
        // 调用setMVP
        my.setMvp("123");
        // 调用getMVP
        String mvp = my.getMvp();
        System.out.println(mvp);
        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(4);
        Integer i = my2.getMvp();
        System.out.println(i);

    }
}
