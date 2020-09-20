package NewTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Student student = null;
        try {
            //创建反序列化流
            FileInputStream fileInputStream = new FileInputStream("Student.text");
            ObjectInputStream in  = new ObjectInputStream(fileInputStream);
            student = (Student)in.readObject();
            in.close();
            fileInputStream.close();
        }catch (IOException ioException){
            ioException.printStackTrace();
            return;
        }catch (ClassNotFoundException classNotFoundException){
            System.out.println("Student class not found");
            classNotFoundException.printStackTrace();
            return;
        }
        System.out.println("name"+student.getName());
        System.out.println("sid"+student.getSid());
        System.out.println("birthday"+student.getBirthday());
        System.out.println("age"+student.getAge());
    }
}
