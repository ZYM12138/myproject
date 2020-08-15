package ObjectOriented.InterfaceTest;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterFaceDefaultA a  = new MyInterFaceDefaultA();
        a.methodAbs();
        a.methodAbsDefault();
        System.out.println("============");
        MyInterFaceDefaultB b = new MyInterFaceDefaultB();
        b.methodAbs();
        b.methodAbsDefault();
    }
}
