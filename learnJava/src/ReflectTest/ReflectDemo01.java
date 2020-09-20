package ReflectTest;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 获得Person类对应的Class对象
        Class c1 = Person.class;
        System.out.println(c1.getName());
        // 创建Person对象
        Person person = new Person();
        // 通过getClass方法
        Class c2 = person.getClass();
        System.out.println(c1==c2);
        // 通过Class类的静态方法获得： static Class forName("类全名")
        Class c3 = Class.forName("ReflectTest.Person");
        System.out.println(c1==c3);

        Person person1 = (Person)c3.newInstance();
        System.out.println(person1);
    }
}
