public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "Tolstoy");
        Author author2 = new Author("Fedor", "Dostoevsky");

        Book book1 = new Book("War and Peace", author1, 1968);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        System.out.println("Book 1: " + book1.getTitle() + " " + ", wrote" + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + " " + book1.getPublicationYear() + " year");
        System.out.println("Book 2: " + book2.getTitle() + " " + ", wrote" + " " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + " " + book2.getPublicationYear() + " year");

        //Изменение года
        book1.setPublicationYear(1870);
        System.out.println("Book 1: " + book1.getTitle() + " " + ", wrote" + " " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + book1.getPublicationYear() + " year");
    }
}