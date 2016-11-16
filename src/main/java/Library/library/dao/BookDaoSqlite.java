package Library.library.dao;

import Library.library.domain.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Tomek on 2016-11-16.
 */
public class BookDaoSqlite implements BookDao {
    private Connection connection;

    public BookDaoSqlite(){
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:library.db");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
        private void createTable(){
            String sql = "CREATE TABLE IF NOT EXIST Books("
                    +"id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    +"title TEXT, "
                    +"author TEXT, "
                    +"pages INTEGER "
                    +");";
        try{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        }
        catch (SQLException e){
            System.out.println("Nie udało się wykonać SQL "+e.getMessage());
        }
    }
public static void main(String[] args){
    BookDaoSqlite bookDaoSqlite = new BookDaoSqlite();


}

    @Override
    public void Book(Book book) {


    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public List<Book> getAllBook() {
        return null;
    }
}
