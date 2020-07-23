package array;

/**
 * @author Vincent
 */
public class Demo12ArrayMax {

    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000, 30, 35};
        // 比武擂台
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素，比max更大，则换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 谁最后最厉害，就能在max当中留下谁的战斗力
        System.out.println("最大值：" + max);
    }

}
