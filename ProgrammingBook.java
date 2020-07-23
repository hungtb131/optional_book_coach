package book;

public class ProgrammingBook extends Book {
    private String LaguageProgamming,FrameWork;

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
    }
    public ProgrammingBook(int bookCode, String name, int price, String author) {
        super(bookCode, price, name, author);
    }
    public ProgrammingBook(int bookCode, int price, String name, String author, String laguageProgamming, String frameWork) {
        super(bookCode, price, name, author);
        this.LaguageProgamming = laguageProgamming;
        this.FrameWork = frameWork;
    }

    public String getLaguageProgamming() {
        return LaguageProgamming;
    }

    public void setLaguageProgamming(String laguageProgamming) {
        LaguageProgamming = laguageProgamming;
    }

    public String getFrameWork() {
        return FrameWork;
    }

    public void setFrameWork(String frameWork) {
        FrameWork = frameWork;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "LaguageProgamming='" + LaguageProgamming + '\'' +
                ", FrameWork='" + FrameWork + '\'' +
                '}';
    }
}
