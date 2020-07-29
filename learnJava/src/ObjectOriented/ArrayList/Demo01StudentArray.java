package ObjectOriented.ArrayList;
//使用学生数组，存储三个学生对象
public class Demo01StudentArray {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];

        //创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);

        //把学生对象放进学生数组中
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //遍历学生数组
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+","+students[i].getAge());
        }
    }
}
