package ProxyTest;

public class Test {
    public static void main(String[] args) {
        SchoolService schoolService = (SchoolService)LogProxy.getProxy(new SchoolServiceImpl());
        System.out.println(schoolService.login("admin","123456"));
        System.out.println(schoolService.getAllClazzs());
    }
}
