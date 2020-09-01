package ObjectOriented.StringBuilderClass;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder); // (空白)
        System.out.println("==============");
        // 使用带参构造
        StringBuilder stringBuilder1 = new StringBuilder("Hello World");
        System.out.println(stringBuilder1);
    }
}
