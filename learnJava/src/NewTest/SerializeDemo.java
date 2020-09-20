package NewTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Student student = new Student("18","zhangsan",20,"2020");
        try {
            //创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.text"));
            out.writeObject(student);
            out.close();
            System.out.println("Serialized data is saved");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
