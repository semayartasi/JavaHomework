package day43.Homework;

public class Book {
    // Let's write a OnlineShop that sells books: ChildrenBook & Comics
    // use inheritance, polymorphism and encapsulation while doing this

    // Hint: you can use Book.java as parent class

    private String bookName;
    private String author;
    private String publisher;
    private int edition;
    private int price;

    public Book(String bookName, String author, String publisher, int edition, int price) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void onlineWebsite(){
        System.out.println("sell by Amazon");
    }
}
