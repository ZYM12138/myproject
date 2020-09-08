package ObjectOriented.ExceptionDemo;

public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        //每个窗口的卖票操作
        //窗口永远开启
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖" + ticket--);
                }
            }
        }
    }
}
