public class Main {
    public static void main(String[] args) {
        Author author = new Author("Lev", "Tolstoy");
        Book book = new Book("War and Peace", author, 2000);
        System.out.println("book = " + book.getNameBook() + " author " + book.author.getFirstName() + " " + book.author.getLastName() + " year " + book.getPublishingYear());
        book.setPublishingYear(2020);
        System.out.println("book = " + book.getNameBook() + " author " + book.author.getFirstName() + " " + book.author.getLastName() + " year " + book.getPublishingYear());

        Author author2 = new Author("Lewis", "Carrol");
        Book book2 = new Book("Alis in mirror", author2, 2011);
        System.out.println("book = " + book2.getNameBook() + " author " + book2.author.getFirstName() + " " + book2.author.getLastName() + " year " + book2.getPublishingYear());
        book2.setPublishingYear(2020);
        System.out.println("book = " + book2.getNameBook() + " author " + book2.author.getFirstName() + " " + book2.author.getLastName() + " year " + book2.getPublishingYear());
    }
}