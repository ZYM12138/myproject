package ObjectOriented.redpacket;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Admin admin = new Admin("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        admin.show();
        one.show();
        two.show();
        three.show();
        System.out.println("==================");

        ArrayList<Integer> redlist = admin.send(20,3);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);

        admin.show();
        one.show();
        two.show();
        three.show();
    }
}
