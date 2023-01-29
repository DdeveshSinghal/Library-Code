//package com.company;

class Library{
    String[] books;
    int no_of_books;
//    using library constructor
    Library(){
       this.books = new String [100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }
    void ShowAvailableBook(){
        System.out.println("Available Books are:");
        for (String book : this.books){
            if (book == null){
                continue;
            }
            System.out.println("* "+books);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i].equals(book)){
                System.out.println(book+" book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String book){
//        this.books[no_of_books] = book;
//        System.out.println(book+ " has been return");
        addBook(book);
    }

}
public class Online_Library {
    public static void main(String[] args) {
//        You hava to implement a library using Java class library
//        Method: addBook, issueBook, returnBooks, showAvailableBooks
//        Properties: Array to store the available books.
//        Array to store the issued books

        Library obj = new Library();
        obj.addBook("English");
        obj.addBook("Java");
        obj.addBook("python");
        obj.ShowAvailableBook();

        obj.issueBook("Java");
        obj.issueBook("English");
        obj.ShowAvailableBook();

        obj.returnBook("Java");
        obj.returnBook("English");
        obj.ShowAvailableBook();


    }
}
