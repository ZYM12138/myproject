package ObjectOriented.day2;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("李四");
        s.setAge(18);
        System.out.println(s.getName()+"----"+s.getAge());
        Student s2= new Student("张三",18);
        System.out.println(s2.getName()+"----"+s2.getAge());
    }
}
