package book;

import java.util.*;

public class BookList {
    public ArrayList<Book> sortbyselection(ArrayList<Book> bookArrayList) {
        int MinIndex = 0;
        int i;
        for (i = 0; i < bookArrayList.size(); i++) {
            int Min = bookArrayList.get(i).getPrice();
            MinIndex = i;
            for (int j = i++; j < bookArrayList.size(); j++) {
                Min = bookArrayList.get(j).getPrice();
                MinIndex = j;
            }
        }
        Book book;
        book = bookArrayList.get(MinIndex);
        bookArrayList.set(MinIndex, bookArrayList.get(i));
        bookArrayList.set(i, book);
        System.out.print(bookArrayList.get(i).getPrice() + "\t");
        System.out.println(bookArrayList.get(MinIndex).getPrice());
        return bookArrayList;
    }
    public ArrayList<Book> sortInsert(ArrayList<Book> bookArrayList){
        for (int i = 1;i < bookArrayList.size();i ++) {
            Book key = bookArrayList.get(i);
            int j;
            for (j = i - 1; j >= 0 && bookArrayList.get(j).getPrice() > key.getPrice(); j--) {
                Book book;
                book = bookArrayList.get(j);
                bookArrayList.set(j + 1, book);
            }
            bookArrayList.set(j + 1,key );
            for (Book book : bookArrayList){
                System.out.print(book.getPrice() + "\t");
            }
            System.out.println();
        }
        return bookArrayList;
    }
    public ArrayList<Book> sortBubble(ArrayList<Book> bookArrayList){
        for (int i = 0; i < bookArrayList.size(); i++) {
            boolean checkChange = false;
            System.out.println("Change " + i);
            for (int j = bookArrayList.size() - 1; j > i; j--) {
                if (bookArrayList.get(j).getPrice() < bookArrayList.get(j - 1).getPrice()) {
                    Book book;
                    book = bookArrayList.get(j);
                    bookArrayList.set(j, bookArrayList.get(j - 1));
                    bookArrayList.set(j - 1, book);
                    checkChange = true;
                    System.out.print(bookArrayList.get(j-1).getPrice() + "\t");
                    System.out.println(bookArrayList.get(j).getPrice());
                }
            }
            if (!checkChange){
                return bookArrayList;
            }
        }
        return bookArrayList;
    }
    public void ProgrammingBookList (ArrayList<ProgrammingBook> programmingBookArrayList){
        programmingBookArrayList.add(new ProgrammingBook(110,120,"Java Introduction","James Gosb","Java","Collerction"));
        programmingBookArrayList.add(new ProgrammingBook(111,120,"Java Advanced Programming","Christiano Jr","Java","MVC"));
        programmingBookArrayList.add(new ProgrammingBook(112,120,"Java Script Primary","Aotonio","J.S","framework1"));
        programmingBookArrayList.add(new ProgrammingBook(113,120,"Angular make everything easier","Ricardo","J.S","Angular"));
        programmingBookArrayList.add(new ProgrammingBook(114,120,"PHP Introduction","Wayne","PHP","Laravel"));

    }
    public void ListProgrammingBook (ArrayList<ProgrammingBook> programmingBookArrayList){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter bookCode : "); //nhap ma sach
            int bookCode = sc.nextInt();
            System.out.println("Enter book's name : ");
            String name = sc.nextLine();
            System.out.println("Enter price of book : ");
            int price = sc.nextInt();
            System.out.println("Enter author of book : ");
            String author = sc.nextLine();
            System.out.println("Enter language : ");
            String language = sc.nextLine();
            System.out.println("Enter framework : ");
            String framework = sc.nextLine();
            programmingBookArrayList.add(new ProgrammingBook(bookCode,name,price,author,language,framework));
        }

        public void FictionBookList (ArrayList<FictionBook> fictionBookArrayList){
        fictionBookArrayList.add(new FictionBook(115,120,"Yeu em tren tung dong code p1","no name","Romantic"));
        fictionBookArrayList.add(new FictionBook(116,120,"Yeu em tren tung dong code p2","no name","Romantic"));
        fictionBookArrayList.add(new FictionBook(117,120,"Yeu em tren tung dong code p3","no name","Romantic"));
        fictionBookArrayList.add(new FictionBook(118,120,"Yeu em tren tung dong code p4","no name","Romantic"));
        fictionBookArrayList.add(new FictionBook(119,120,"Yeu em tren tung dong code p5","no name","Romantic"));
        }
        public void ListFictionBook (ArrayList<FictionBook> fictionBookArrayList){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter book code : " );
            int bookCode = sc.nextInt();
            System.out.println("Enter price : ");
            int price = sc.nextInt();
            System.out.println("Enter book's name " );
            String name = sc.nextLine();
             System.out.println("Enter a author of book: ");
            String author = sc.nextLine();
            System.out.println("Enter a category of book: ");
            String category = sc.nextLine();
            fictionBookArrayList.add(new FictionBook(bookCode,price,name,author,category));

        }
        public void BookList (ArrayList<ProgrammingBook> programmingBookArrayList,ArrayList<FictionBook> fictionBookArrayList,ArrayList<Book> bookArrayList) {
        bookArrayList.addAll(programmingBookArrayList);
        bookArrayList.addAll(fictionBookArrayList);
        }
        public void getCost (ArrayList<Book> bookArrayList){
        int Cost = 0;
        for (Book book : bookArrayList){
            Cost = Cost + book.getPrice();
            }
            System.out.println("Total Cost : " + Cost);
        }
        public void Javacheck (ArrayList<ProgrammingBook> programmingBookArrayList){
        int count = 0;
        for (ProgrammingBook programmingBook : programmingBookArrayList){
            boolean Javacheck = programmingBook.getLaguageProgamming().equals("Java");
            if (Javacheck){
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No Java programming book");
        }
        else
            System.out.println("Have " + count + " Java programming book");
        }
        public int nameSearchbyLinear(ArrayList<Book> bookArrayList, String name){
            for (Book book : bookArrayList){
                boolean checkname = book.getName().equals(name);
                if (checkname){
                    return book.getPrice();
                }
            }
            return -1;
        }
        private void sortByComparator(ArrayList<Book> bookArrayList){
            Collections.sort(bookArrayList, new Comparator<Book>() {
                @Override
                public int compare(Book o1, Book o2) {
                    return o1.getName().charAt(0) - (o2.getName().charAt(0));
                }
            });
        }


    }






