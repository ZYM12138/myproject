package ObjectOriented.InterfaceTest;

public interface MyInterfaceDefault {
    public abstract void methodAbs();
    public default void methodAbsDefault(){
        System.out.println("实现了默认方法");
    };
}
