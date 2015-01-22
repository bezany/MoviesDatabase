import dao.entity.AuthorDAO;
import dao.entity.BookDAO;
import dao.hibernate.AuthorDAOImpl;
import dao.hibernate.BookDAOImpl;
import entity.Author;
import entity.Book;

import java.util.HashSet;
import java.util.List;

/**
 * Created by user on 14.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();

        Book book = new Book();
        book.setTitle("book1");
        book.setDescription("book1");
        book.setIsbn(1);
        bookDAO.addBook(book);
        Book book2 = new Book();
        book2.setTitle("book2");
        book2.setDescription("book2");
        book2.setIsbn(2);
        bookDAO.addBook(book2);
        Book book3 = new Book();
        book3.setTitle("book3");
        book3.setDescription("book3");
        book3.setIsbn(3);
        bookDAO.addBook(book3);

        List<Book> books  = bookDAO.getBooks();

        AuthorDAO authorDAO = new AuthorDAOImpl();
        Author author = new Author();
        author.setLastName("A");
        author.setFirstName("A");
        author.setAge(1);
        author.setBooks(new HashSet<Book>(books));

        authorDAO.addAuthor(author);



    }
}