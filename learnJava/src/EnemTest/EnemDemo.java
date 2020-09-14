package EnemTest;

public class EnemDemo {
    enum Season{
        spring,summer,fall,winter;
    }

    public static void main(String[] args) {
        getSeason(Season.spring);
    }

    public static void getSeason(Season season){
        switch (season){
            case fall:
                System.out.println("fall");
                break;
            case spring:
                System.out.println("spring");
                break;
            case summer:
                System.out.println("summer");
                break;
            case winter:
                System.out.println("winter");
                break;
        }
    }
}
