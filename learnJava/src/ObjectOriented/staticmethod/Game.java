package ObjectOriented.staticmethod;
/*
static关键字修饰代码块，位置在类中方法外，随着类的加载只执行一次，优先于main方法和构造方法的执行
static的主要使用目的是想在不创建对象的情况下去调用方法
 */
import java.util.ArrayList;

public class Game {
    public static int number;
    public static ArrayList<String> list;

    static {
        number = 2;
        list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
    }
}
