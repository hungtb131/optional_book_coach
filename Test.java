package book;

import java.util.ArrayList;

public class Test {
    BookList bookList = new BookList();
    ArrayList<ProgrammingBook> programmingBookArrayList = new ArrayList<>();
    ArrayList<FictionBook> fictionBookArrayList = new ArrayList<>();
    ArrayList<Book> bookArrayList = new ArrayList<>();
    private int price;

//    public void nameSearchbyLinear(){
//        bookArrayList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a book name : ");
//        String name = sc.nextLine();
//        int price = bookArrayList.nameSearchbyLinear(bookArrayList, name);
//        if (price != -1){
//            System.out.println( "price of : " + name + " is : " +price) ;
//        }else
//            System.out.println("Have no that book!");
//    }
//    public void searchByBinary(){
//        bookArrayList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a book name : ");
//        String name = sc.nextLine();
//        int index = bookList.searchByBinary(bookArrayList,name,0,bookArrayList.size() -1);
//        if (index !=(-1)){
//            System.out.println("price of : " + name + " is : " + price);
//        }else
//            System.out.println("Have no that book");
//
//    }
    public  void ListProgrammingBook(){
        bookList.ListProgrammingBook(programmingBookArrayList);
    }
    public  void FictionBookList(){
        bookList.FictionBookList(fictionBookArrayList);
    }
    public void  getCost(){
        bookList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
        bookList.getCost(bookArrayList);
    }
    public void  Javachek(){
        bookList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
        bookList.Javacheck(programmingBookArrayList);
    }
    public void sortbyselection(){
        bookList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
        bookList.sortbyselection(bookArrayList);
    }
    public void sortInsert(){
        bookList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
        bookList.sortbyselection(bookArrayList);
    }
    public  void sortBubble(){
        bookList.BookList(programmingBookArrayList,fictionBookArrayList,bookArrayList);
        bookList.sortBubble(bookArrayList);

    }
}
