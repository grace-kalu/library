package com.library;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Library Merald = new Library("Grace");
        Merald.addBook("Those dreams are real",  "Grace Kalu", 2);
        Merald.printBook();
      Users LibraryUser = new Users();
      LibraryUser.addUser("Grace", "teacher");
        LibraryUser.addUser("Faith", "junior");
        LibraryUser.addUser("Glory", "senior");
        LibraryUser.addUser("Tony", "teacher");
      LibraryUser.findUser("Grace");
      LibraryUser.findUser("Faith");
        System.out.println(LibraryUser.printUsers());
        Merald.addToLibraryQueue(Merald.getBorrowers(), LibraryUser, "Faith", "Those dreams are real");
        Merald.addToLibraryQueue(Merald.getBorrowers(), LibraryUser, "Grace", "Those dreams are real");
        Merald.addToLibraryQueue(Merald.getBorrowers(), LibraryUser, "Grace", "Those dreams are real");
        LibraryUser.addUser("Grace", "teacher");
        Merald.lendBooks(Merald.getBorrowers(), Merald.getBooks());

        PriorityQueue<User> priority = new PriorityQueue<User>();
   }

}
