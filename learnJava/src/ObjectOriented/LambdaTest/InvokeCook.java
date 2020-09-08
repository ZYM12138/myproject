package ObjectOriented.LambdaTest;

public class InvokeCook {
    public static void main(String[] args) {
        InvokeCook(()->{
            System.out.println("吃饭了");
        });
    }



    public static void InvokeCook(Cook cook){
        cook.madeFood();
    }
}
