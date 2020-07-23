package book;

public class FictionBook extends Book{
    private String category;

    public FictionBook() {
    }


    public FictionBook(String category) {
        this.category = category;
    }
    public FictionBook(int bookCode, String name, int price, String author) {
        super(bookCode, price, name,  author);
    }

    public FictionBook(int bookCode, int price, String name, String author, String category) {
        super(bookCode, price, name, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "category='" + category + '\'' +
                '}';
    }
}
