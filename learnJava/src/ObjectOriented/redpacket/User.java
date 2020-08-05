package ObjectOriented.redpacket;

public class User {
    private String username;
    private int money;

    public User() {
    }

    public User(String username, int money) {
        this.username = username;
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void show(){
        System.out.println("用户名:"+username+",余额为:"+money+"元");
    }
}
