package ObjectOriented.ExceptionDemo;

public class Ticket2 implements Runnable {
    private int ticket = 100;


    @Override
    public void run() {
        //每个窗口的卖票操作
        //窗口永远开启
        while (true) {
            sellTicket();
        }
    }

    public synchronized void sellTicket() {
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
