package ObjectOriented.InterfaceTest;

public class MyInterFaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }
    @Override
    public void methodAbsDefault(){
        System.out.println("实现类B重写了默认方法");
    }
}
