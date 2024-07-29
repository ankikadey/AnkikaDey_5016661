import java.util.Arrays;
import java.util.Scanner;

public class LibraryManagementTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Setup sample books
        Book[] books = {
            new Book("1", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("2", "1984", "George Orwell"),
            new Book("3", "To Kill a Mockingbird", "Harper Lee"),
            new Book("4", "Moby-Dick", "Herman Melville")
        };

        // Sort books by title for binary search
        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));

        LibraryManager manager = new LibraryManager(books);
        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Search Book by Title (Linear Search)");
            System.out.println("2. Search Book by Title (Binary Search)");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Linear Search
                    System.out.print("Enter Book Title to search: ");
                    String title = scanner.nextLine();
                    Book book = manager.linearSearchByTitle(title);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 2:
                    // Binary Search
                    System.out.print("Enter Book Title to search: ");
                    title = scanner.nextLine();
                    book = manager.binarySearchByTitle(title);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    // Exit
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
