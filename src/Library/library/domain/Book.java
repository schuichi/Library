package Library.library.domain;

/**
 * Created by Tomek on 2016-11-16.
 */
public class Book {
    private int id;
    private String title;
    private String autor;
    private int pages;

    public Book(int id, String title, String autor, int pages) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.pages = pages;
    }

    public Book(String title, String autor) {
        this.title = title;
        this.autor = autor;
    }

    public Book(int id, String title, String autor) {

        this.id = id;
        this.title = title;
        this.autor = autor;
    }

    public Book(String title, String autor, int pages) {
        this.title = title;
        this.autor = autor;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", pages=" + pages +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
