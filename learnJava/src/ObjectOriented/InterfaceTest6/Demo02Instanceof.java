package ObjectOriented.InterfaceTest6;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();// 本来是一只狗
        animal.eat();// 狗吃骨头

        // 如果希望掉用子类特有方法，需要向下转型
        // 判断一下父类引用animal本来是不是Dog
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
        }
        // 判断一下animal本来是不是Cat
        if (animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }
    public static void giveMeAPet(Animal animal){
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
