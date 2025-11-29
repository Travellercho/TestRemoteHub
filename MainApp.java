/**
 * 文件名：MainApp.java
 * 描述：主程序入口
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== 图书管理系统启动 ===");

        // 创建服务实例
        BookService service = new BookService();

        // 创建一本新书
        Book book1 = new Book(1, "Git实战教程", "深圳大学");

        // 调用服务
        service.addBook(book1);
        service.updateBook();

        System.out.println("=== 系统运行结束 ===");
    }
}