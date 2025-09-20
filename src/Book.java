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

}

