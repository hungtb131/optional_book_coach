package book;

public class Book {
    private   String bookCode;
    String name;
    private String author;
    int price;

    public Book(String bookCode, String name, String author, int price) {
        this.bookCode = bookCode;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(){

    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCode='" + bookCode + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
            ", price=" + price +
            '}';
}
}
