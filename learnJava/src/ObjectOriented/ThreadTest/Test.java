package ObjectOriented.ThreadTest;

public class Test {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);
        ch.start();
        bzp.start();
    }
}
