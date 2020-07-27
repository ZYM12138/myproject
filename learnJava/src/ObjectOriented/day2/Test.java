package ObjectOriented.day2;

public class Test {
    public static void main(String[] args) {
        System.out.println(new Student("张三",18).getName());
        System.out.println(getStudent());;
    }
    public static String getStudent(){
        return new Student("李四",20).getName();
    }

}
