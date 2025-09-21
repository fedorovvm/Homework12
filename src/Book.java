import java.util.Objects;
public class Book {
    private String bookTitle;
    private Author author;
    private int yearPublication;

    public Book(String bookTitle, Author author, int yearPublication) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearPublication =yearPublication;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    public String toString() {
        return bookTitle+". "+ author.toString() +". "+ yearPublication+".";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return  Objects.equals(bookTitle, book.bookTitle) &&
                Objects.equals(author, book.author)&&
                yearPublication == book.yearPublication;
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author,yearPublication);
    }
}

