package ObjectOriented.staticmethod;

public class StuDemo {
    public static void main(String[] args) {
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("赵六",26);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
    }
}
