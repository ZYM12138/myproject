package ObjectOriented.ExceptionDemo;

public class TicketTest {
    public static void main(String[] args) {
        //创建线程对象
        Ticket3 ticket = new Ticket3();
        //创建窗口对象
        Thread t1 = new Thread(ticket,"窗口1");
        Thread t2 = new Thread(ticket,"窗口2");
        Thread t3 = new Thread(ticket,"窗口3");
        //同时卖票
        t1.start();
        t2.start();
        t3.start();
    }
}
