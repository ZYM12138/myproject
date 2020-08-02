package ObjectOriented.StringTest;
/*
定义一个方法，把数组{1,2,3}拼接成[word1#word2#word3#]
 */
public class StringTest1 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(arrayToString(array));
    }
    public static String arrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str += "word"+array[i]+"#"+"]";
            } else{
                str += "word"+array[i]+"#";
            }
        }
        return str;
    }
}
