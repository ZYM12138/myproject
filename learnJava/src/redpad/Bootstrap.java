package redpad;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("红包");

        red.setOwnerName("张三");
        //普通红包


        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
