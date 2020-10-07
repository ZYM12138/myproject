package ObjectOriented.ThreadTest;

public class BaoZiPu extends Thread{
    private Baozi bz;

    public BaoZiPu(String name,Baozi bz){
        super(name);
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true){
            synchronized (bz){
                if (bz.flag==true){
                    try {
                        bz.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println("没有包子，开始造包子");
                if (count%2==0){
                    bz.pier = "冰皮";
                    bz.xianer = "蛋黄莲蓉";
                }else {
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                bz.flag = true;
                System.out.println("包子好了，来吃吧");
                bz.notify();
            }
        }
    }
}
