package kolekcije.biblioteka;

import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int isbn;

Scanner scanner = new Scanner(System.in);

    public Book() {
        System.out.println("Enter title name: ");
     this.title = scanner.nextLine();
        System.out.println("Enter author name: ");
        this.author = scanner.nextLine();
        System.out.println("Enter ISBN: ");
        this.isbn = scanner.nextInt();
    }

    void printBookDetails() {
        System.out.println("Title: " + this.title + ".\nAuthor: " + this.author + ".\nInternational standard book number: " + this.isbn);
    }

}
