public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 2000);
        System.out.println("book = " + book.getNameBook() + " autor " + book.getAuthor() + " year " + book.getPublishingYear());
        book.setPublishingYear(2020);
        System.out.println("book = " + book.getNameBook() + " autor " + book.getAuthor() + " year " + book.getPublishingYear());

        Author author2 = new Author("Lewis", "Carrol");
        Book book2 = new Book("Alis in mirrow", author2, 2011);
        System.out.println("book = " + book2.getNameBook() + " autor " + book2.getAuthor() + " year " + book2.getPublishingYear());
        book2.setPublishingYear(2020);
        System.out.println("book = " + book2.getNameBook() + " autor " + book2.getAuthor() + " year " + book2.getPublishingYear());
    }
}