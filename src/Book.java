import java.time.LocalDate;

public class Book {
    private String nameBook;
    private Author author;
    public int publishingYear;

    public Book (String nameBook, Author autor, int publishingYear) {
        this.nameBook = nameBook;
        this.author = autor;
        this.publishingYear = publishingYear;
    }
    public String getAuthor() {
        return author;
    }
    public String getNameBook() {
        return nameBook;
    }
    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1950 || publishingYear > LocalDate.now().getYear() + 1) {
            System.out.println("Invalid publishing year:" + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}
