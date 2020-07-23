package array;

/**
 * @author Vincent
 */
public class Demo07ArraySame {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        // 地址值
        System.out.println(arrayA);
        // 0
        System.out.println(arrayA[0]);
        // 0
        System.out.println(arrayA[1]);
        // 0
        System.out.println(arrayA[2]);
        System.out.println("==============");

        arrayA[1] = 10;
        arrayA[2] = 20;
        // 地址值
        System.out.println(arrayA);
        // 0
        System.out.println(arrayA[0]);
        // 10
        System.out.println(arrayA[1]);
        // 20
        System.out.println(arrayA[2]);
        System.out.println("==============");

        // 将arrayA数组的地址值，赋值给arrayB数组
        int[] arrayB = arrayA;
        // 地址值
        System.out.println(arrayB);
        // 0
        System.out.println(arrayB[0]);
        // 10
        System.out.println(arrayB[1]);
        // 20
        System.out.println(arrayB[2]);
        System.out.println("==============");

        arrayB[1] = 100;
        arrayB[2] = 200;
        // 地址值
        System.out.println(arrayB);
        // 0
        System.out.println(arrayB[0]);
        // 100
        System.out.println(arrayB[1]);
        // 200
        System.out.println(arrayB[2]);
    }
}
