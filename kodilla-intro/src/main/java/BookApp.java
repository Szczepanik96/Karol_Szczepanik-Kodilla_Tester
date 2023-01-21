public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("The Year of the Witching", "Alexis Henderson");
        Book book1 = Book.of("Pine", "Francine Toon");
        Book book2 = Book.of("Book Lovers", "Emily Henry");
        Book book3 = Book.of("Yinka, Where is Your Huzband?", "Lizzie Damilola Blackburn");
        Book book4 = Book.of("Great Circle", "Maggie Shipstead");
        Book book5 = Book.of("Tom Clancy's Oath of Office", "Marc Cameron");

        System.out.println(book1.getAuthor() + " " + book.getTitle());
    }
}
