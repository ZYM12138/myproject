package array;

/**
 * @author Vincent
 */
public class Demo06ArrayTwo {
    public static void main(String[] args) {
        int[] arraya = new int[3];
        // 地址值
        System.out.println(arraya);
        // 0
        System.out.println(arraya[0]);
        // 0
        System.out.println(arraya[1]);
        // 0
        System.out.println(arraya[2]);
        System.out.println("==============");

        arraya[1] = 10;
        arraya[2] = 20;
        // 地址值
        System.out.println(arraya);
        // 0
        System.out.println(arraya[0]);
        // 10
        System.out.println(arraya[1]);
        // 20
        System.out.println(arraya[2]);
        System.out.println("==============");

        int[] arrayb = new int[3];
        // 地址值
        System.out.println(arrayb);
        // 0
        System.out.println(arrayb[0]);
        // 0
        System.out.println(arrayb[1]);
        // 0
        System.out.println(arrayb[2]);
        System.out.println("==============");

        arrayb[1] = 100;
        arrayb[2] = 200;
        // 地址值
        System.out.println(arrayb);
        // 0
        System.out.println(arrayb[0]);
        // 100
        System.out.println(arrayb[1]);
        //200
        System.out.println(arrayb[2]);
    }
}
