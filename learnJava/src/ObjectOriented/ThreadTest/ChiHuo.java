package ObjectOriented.ThreadTest;

public class ChiHuo extends Thread {
    private Baozi bz;
    public ChiHuo(String name,Baozi bz){
        super(name);
        this.bz=bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag==false){
                    try {
                        bz.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pier+bz.xianer+"包子");
                bz.flag=false;
                bz.notify();
            }
        }
    }
}
