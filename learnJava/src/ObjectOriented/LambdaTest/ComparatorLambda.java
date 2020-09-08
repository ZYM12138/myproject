package ObjectOriented.LambdaTest;

import java.util.Arrays;

public class ComparatorLambda {
    public static void main(String[] args) {
        // 本来年龄乱序的对象数组
        Person[] array = {
                new Person("古力娜扎", 19),
                new Person("迪丽热巴", 18),
                new Person("马尔扎哈", 20) };

        Arrays.sort(array,(Person o1,Person o2)->{return o1.getAge()-o2.getAge();});
        for (Person person : array) {
            System.out.println(person);
        }
    }
}
