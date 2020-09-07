package ObjectOriented.ExceptionDemo;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 5;
        System.out.println(getElement(arr,index));
    }
    public static int getElement(int[]arr,int index){
        if (index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        int element = arr[index];
        return element;
    }
}
