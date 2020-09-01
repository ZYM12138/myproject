package ObjectOriented.DateClass;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy(src, 1, dest, 0, 2);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(dest));
    }
}
