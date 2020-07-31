package ObjectOriented.StringTest;
/*
public String split(String regex) 方法参数是正则表达式
如果要进行英文句点"."进行切分，必须写"\\."(两个反斜杠)
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");
        String str1 = "aaa bbb ccc";
        String[] array1 = str1.split(" ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
