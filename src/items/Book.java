package items;

public class Book extends LibraryItem {
    private int yearPublished;
    private int isbn;

    public Book(String authorName, int yearPublished, int isbn, String title){
        super(title,authorName);
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }
}
