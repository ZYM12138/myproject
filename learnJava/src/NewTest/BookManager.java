package NewTest;

import java.lang.reflect.Type;
import java.util.*;

public class BookManager {
    public static void main(String[] args) {
        Map<String, ArrayList<Book>> map = new HashMap<>();
        // 创建集合对象，用于存储IT书籍数据
        ArrayList<Book> it = new ArrayList<>();
        it.add(new Book("java从入门到精通", 20.0));
        it.add(new Book("python从入门到精通", 22.0));
        map.put("it书籍", it);
        //创建集合对象，用于存储名著书籍数据
        ArrayList<Book> mz = new ArrayList<>();
        mz.add(new Book("西游记", 15.0));
        mz.add(new Book("三国演义", 16.0));
        map.put("名著", mz);
        while (true) {
            //这是学生管理系统的主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1.查看所有书籍");
            System.out.println("2.添加书");
            System.out.println("3.删除书");
            System.out.println("4.修改书");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            //创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    // 查看所有书籍
                    findAllBook(map);
                    break;
                case 2:
                    // 添加书籍
                    addBook(map);
                    break;
                case 3:
                    // 删除书
                    System.out.println("删除书");
                    break;
                case 4:
                    // 修改书
                    System.out.println("修改书");
                    break;
                case 5:
                    // 退出
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
                    break;
            }
        }
    }

    public static void findAllBook(Map<String, ArrayList<Book>> map) {
        System.out.println("类型\t\t书名\t\t\t价格");
        Set<Map.Entry<String, ArrayList<Book>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<Book>> entry : entries) {
            String key = entry.getKey();
            System.out.println(key);

            ArrayList<Book> value = entry.getValue();
            for (Book book : value) {
                System.out.println("\t\t" + book.getName() + "\t\t" + book.getPrice());
            }
        }
    }
    public static void addBook(Map<String, ArrayList<Book>> map){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加书籍的类型:");
        String type = sc.next();
        System.out.println("请输入要添加的书名:");
        String name = sc.next();
        System.out.println("请输入要添加书的价格:");
        double price = sc.nextDouble();
        Book book = new Book(name, price);
        ArrayList<Book> books = map.get(type);
        if (books == null){
            books = new ArrayList<>();
            map.put(type,books);
        }
        books.add(book);
        System.out.println("添加"+name+"成功");
    }

}
