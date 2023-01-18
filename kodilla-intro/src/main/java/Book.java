public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }
    public static Book of(String title, String author){
       Book book = Book.of("The Year of the Witching", "Alexis Henderson");
       Book book1 = Book.of("Pine", "Francine Toon");
       Book book2 = Book.of("Book Lovers", "Emily Henry");
       Book book3 = Book.of("Yinka, Where is Your Huzband?", "Lizzie Damilola Blackburn");
       Book book4 = Book.of("Great Circle", "Maggie Shipstead");
       Book book5 = Book.of("Tom Clancy's Oath of Office", "Marc Cameron");

       return book4;
    }
}