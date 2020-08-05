package ObjectOriented.redpacket;

import java.util.ArrayList;

public class Admin extends User{
    public Admin() {
    }

    public Admin(String username, int money) {
        super(username, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney-totalMoney);
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}
