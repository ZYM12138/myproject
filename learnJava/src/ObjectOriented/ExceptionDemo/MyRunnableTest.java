package ObjectOriented.ExceptionDemo;

public class MyRunnableTest {
    public static void main(String[] args) {
        //创建自定义类对象  线程任务对象
        MyRunnable my = new MyRunnable();
        //创建线程对象
        Thread tr = new Thread(my,"小强");
        tr.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财"+i);
        }
    }
}
