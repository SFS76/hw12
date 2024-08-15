public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Lev", "Tolstoy");
        Book book = new Book("War and Peace", autor.getAutor(), 2000);
        System.out.println("book = " + book.getNameBook() + " autor " + book.getAuthor() + " year " + book.getPublishingYear());
        book.setPublishingYear(2020);
        System.out.println("book = " + book.getNameBook() + " autor " + book.getAuthor() + " year " + book.getPublishingYear());

        Autor autor2 = new Autor("Lewis", "Carrol");
        Book book2 = new Book("Alis in mirrow", autor2.getAutor(), 2011);
        System.out.println("book = " + book2.getNameBook() + " autor " + book2.getAuthor() + " year " + book2.getPublishingYear());
        book2.setPublishingYear(2020);
        System.out.println("book = " + book2.getNameBook() + " autor " + book2.getAuthor() + " year " + book2.getPublishingYear());
    }
}