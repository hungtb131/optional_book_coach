package book;

public class Book {
    private int bookCode,price;
    private String name,author;

    public Book() {
    }

    public Book(int bookCode, int price, String name, String author) {
        this.bookCode = bookCode;
        this.price = price;
        this.name = name;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
