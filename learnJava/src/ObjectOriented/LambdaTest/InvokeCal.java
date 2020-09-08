package ObjectOriented.LambdaTest;

public class InvokeCal {
    public static void main(String[] args) {
        invokeCal(120,130,(int a,int b)->{return a+b;});
    }

    public static void invokeCal(int a,int b,Calculator calculator){
        int result = calculator.cal(a,b);
        System.out.println(result);
    }
}
