package ObjectOriented.ArraysMethod;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] array = {2,34,35,4,657,8,69,9};
        System.out.println(array);

        String s = Arrays.toString(array);
        System.out.println(s);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
