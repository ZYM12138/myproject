package ObjectOriented.extends02;

public class Zi extends Fu {
    int num = 6;
    public void show(){
        System.out.println("Fu num = "+super.num);
        System.out.println("Zi num = "+this.num);
    }
}
