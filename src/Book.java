import java.time.LocalDate;

public class Book {
    private String nameBook;
    private String autor;
    public int publishingYear;

    public Book (String nameBook, String autor, int publishingYear) {
        this.nameBook = nameBook;
        this.autor = autor;
        this.publishingYear = publishingYear;
    }
    public String getAuthor() {
        return autor;
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
