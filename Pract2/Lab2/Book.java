package Lab2;

import java.security.PublicKey;

public class Book {
    private String Author;
    private String bookName;
    private int yearBornBook;
    private int yearBornAuthor;

    public Book(){
        Author = "Karpov";
        bookName = "How to meow-meow";
        yearBornBook = 2034;
        yearBornAuthor = 1850;
    }

    public Book(String Author, String bookName, int yearBornBook, int yearBornAuthor) {
        this.Author = Author;
        this.bookName = bookName;
        this.yearBornBook = yearBornBook;
        this.yearBornAuthor = yearBornAuthor;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYearBornBook() {
        return yearBornBook;
    }

    public void setYearBornBook(int yearBornBook) {
        this.yearBornBook = yearBornBook;
    }

    public int getYearBornAuthor() {
        return yearBornAuthor;
    }

    public void setYearBornAuthor(int yearBornAuthor) {
        this.yearBornAuthor = yearBornAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author = '" + Author + '\'' +
                ", bookName = '" + bookName + '\'' +
                ", yearBornBook = " + yearBornBook +
                ", yearBornAuthor = " + yearBornAuthor +
                '}';
    }
}
