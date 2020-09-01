package ObjectOriented.StringBuilderClass;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = stringBuilder.append("hello world");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder==stringBuilder1);
        stringBuilder.append(1);
        stringBuilder.append(true);
        stringBuilder.append('a');
        System.out.println(stringBuilder);
        StringBuilder sb = new StringBuilder("HelloWorld").append(true).append(100);
        String str = sb.toString();
        System.out.println(str);
    }
}
