import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericCatalog<LibraryItem> catalog = new GenericCatalog<>(); // Create a new instance of GenericCatalog to store LibraryItem objects
        Scanner scanner = new Scanner(System.in); // Create a new Scanner object to read user input
        int choice;

        do {
            System.out.println("Library Catalog Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the user's choice from the console
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine(); // Read the title of the item from the console
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine(); // Read the author of the item from the console
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine(); // Read the item ID from the console
                    LibraryItem item = new LibraryItem(title, author, itemID); // Create a new LibraryItem object with the provided details
                    catalog.addItem(item); // Add the item to the catalog
                    break;
                case 2:
                    System.out.print("Enter item ID to remove: ");
                    String removeID = scanner.nextLine(); // Read the item ID to remove from the console
                    try {
                        catalog.removeItem(removeID); // Remove the item with the specified ID from the catalog
                        System.out.println("Item removed successfully.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Print any exception message if an error occurs during removal
                    }
                    break;
                case 3:
                    catalog.displayCatalog(); // Display the contents of the catalog
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close(); // Close the scanner to release system resources
    }
}
