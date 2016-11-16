package Library.library.dao;

import Library.library.domain.Book;

import java.util.List;

/**
 * Created by Tomek on 2016-11-16.
 */
public interface BookDao {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book>getAllBook();
}
