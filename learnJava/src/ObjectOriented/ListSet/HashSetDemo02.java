package ObjectOriented.ListSet;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象   该集合中存储 Student类型对象
        HashSet<Student> students = new HashSet<>();
        Student stu = new Student("张三",20);
        students.add(new Student("李四",18));
        students.add(new Student("王五",22));
        students.add(new Student("张三",20));
        for (Student student: students){
            System.out.println(student);
        }
    }
}
