package com.library;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
//import java.util.Queue;

public class Library{
    private String librarian;
    private HashMap<String, Integer> books;
    private LocalDate date;
    private LibraryQueue borrowers;

    public Library(String librarian) {
        this.librarian = librarian;
        this.date = date;
        this.books = new HashMap<>();
        this.borrowers = new LibraryQueue() ;
    }
    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public HashMap<String, Integer> getBooks(){
        return books;
    }

    public void setBooks(HashMap<String, Integer> books) {
        this.books = books;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LibraryQueue getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(LibraryQueue borrowers) {
        this.borrowers = borrowers;
    }

    public void addBook(String title, String author, int quantity) {
        if (!this.books.containsKey(title)) {
            this.books.put(title, quantity);
            if(quantity== 1) {
                System.out.println(quantity + " copy of "+ title + " by "+ author +" has been added.");
            }
            else {
                System.out.println(quantity +" copies of " + title + " by "+ author +" have been added.");
            }
        }
        else {
            this.books.put(title, (books.get(title) + quantity));
        }

    }
    public void removeBook(String title) {
        if(this.books.containsKey(title) && (this.books.get(title) > 0)) {
            this.books.put(title, (this.books.get(title) - 1));
            System.out.println(1 + " copy of "+ title +" has been given out.");
        } else {
            System.out.println("Book taken");
        }
    }

    public void printBook() {
        System.out.println("These number of books "+ books + " are available.");
    }

    public void addToLibraryQueue(LibraryQueue borrowers, Users users, String name, String bookTitle) {

        for (User user : users.getUsers()) {
            if ((user.getName().equals(name))) {
                if (borrowers.enqueue(new Register(name, bookTitle)) == 0) {
                    System.out.println(name + " is allowed to borrow " + bookTitle);
                } else if (borrowers.enqueue(new Register(name, bookTitle)) == -1) {
                    System.out.println(name + " is already on the queue.");
                }
                return;
            }
        }
        System.out.println( name + " is not allowed to borrow" + bookTitle);
    }
   public void lendBooks(LibraryQueue borrowers, HashMap<String, Integer> books){
        Register newBorrower = borrowers.dequeue();
            if(newBorrower != null){
                String title = newBorrower.getBookTitle();
                removeBook(title);
            }
    }

    public void PriorityQueue(PriorityQueue<User> priority) {
        // Iterator<Person> it = pp.iterator();
        while (!priority.isEmpty()) {
            User p = priority.poll();
            System.out.println("Thank You");
        }
    }
}