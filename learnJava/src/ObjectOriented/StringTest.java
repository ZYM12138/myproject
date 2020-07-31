package ObjectOriented;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "HelloWorld";
        System.out.println(str1.length());
        System.out.println(str1.equals(str2));
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(5));
        System.out.println(str1.indexOf("W"));
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(2,4));
    }
}
