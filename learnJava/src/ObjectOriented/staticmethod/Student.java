package ObjectOriented.staticmethod;

public class Student {
    private String name;
    private int age;
    private int sid;
    public static int numberOfStudent = 0;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = numberOfStudent++;
    }
    public static void showNum(){
        System.out.println("num:"+numberOfStudent);
    }
    public void show(){
        System.out.println("Student:name="+name+",age="+age+",sid="+sid);
    }

}
