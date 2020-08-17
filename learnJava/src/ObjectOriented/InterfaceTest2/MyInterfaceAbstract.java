package ObjectOriented.InterfaceTest2;

public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {

    }

    //如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
    //@Override
    //public void methodB() {

    //}

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }
}
