package kolekcije.biblioteka;

import java.util.Scanner;

public class UI {

    public int mainMenu() {
        System.out.println("1. Add book, 2. Show all books, 3. Remove book, 4. Show book details 5. Exit program\nChoose option: ");
        return new Scanner(System.in).nextInt();
    }

    public static void main(String[] args) {

        Library library = new Library();

        UI program = new UI();
        Scanner input = new Scanner(System.in);

        while (true) {
            int option = program.mainMenu();
            switch (option) {
                case 1: {

                    library.addBook(new Book());
                    break;
                }
                case 2:
                    library.showAllBooks();
                    break;
                case 3: {
                 
                    library.removeBook(new Book());
                }
                case 4: {
                 
                    library.showBookDetails(new Book());
                }
                case 5:
                    return;
            }
        }
    }

}
