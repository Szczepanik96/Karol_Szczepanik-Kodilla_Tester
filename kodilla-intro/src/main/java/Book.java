public class Book {
    private String title;

    private String author;

//    public Book(String title, String author) {
//        this.title = title;
//        this.author = author;
//
//    }
//
//    public static Book of(String title, String author) {
//        return new Book(title, author);
//    }
    public static Book of(String title, String author){
        Book book = new Book();
        book.title = title;
        book.author = author;
        return book;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
