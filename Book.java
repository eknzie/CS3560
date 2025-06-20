
public class Book {
    private Course course;
    private String name;
    private String author;

    public Book() {
       name = "unknown";
       author = "unknown";
       course = null;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setCourse(int code) {
        this.course = new Course(code, this.name, this.author);
    }
}