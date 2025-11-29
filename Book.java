/**
 * 文件名：Book.java
 * 描述：图书实体类，用于存储图书的基本信息
 */
public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    //用于打印图书详情
    @Override
    public String toString() {
        return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + "]";
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
}