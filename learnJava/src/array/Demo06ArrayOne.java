package array;

/**
 * @author Vincent
 */
public class Demo06ArrayOne {
    public static void main(String[] args) {
        // 动态初始化
        int[] array =new int[3];
        // 地址值
        System.out.println(array);
        // 0
        System.out.println(array[0]);
        // 0
        System.out.println(array[1]);
        // 0
        System.out.println(array[2]);
        System.out.println("===========");

        // 改变数组当中元素的内容
        array[1]=10;
        array[2]=20;
        // 地址值
        System.out.println(array);
        // 0
        System.out.println(array[0]);
        // 10
        System.out.println(array[1]);
        // 20
        System.out.println(array[2]);
    }
}
