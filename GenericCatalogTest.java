public class GenericCatalogTest {  
    public static void main(String[] args) {  
        GenericCatalog<LibraryItem> catalog = new GenericCatalog<>();  
  
        LibraryItem book1 = new LibraryItem("The Great Gatsby", "F. Scott Fitzgerald", "B001");  
        LibraryItem book2 = new LibraryItem("1984", "George Orwell", "B002");  
        LibraryItem dvd1 = new LibraryItem("Inception", "Christopher Nolan", "D001");  
  
        // Adding items to the catalog  
        catalog.addItem(book1);  
        catalog.addItem(book2);  
        catalog.addItem(dvd1);  
  
        // Display the catalog  
        System.out.println("Catalog after adding items:");  
        catalog.displayCatalog();  
  
        // Retrieve an item  
        System.out.println("\nRetrieving item with ID B001:");  
        LibraryItem retrievedItem = catalog.getItem("B001");  
        System.out.println(retrievedItem);  
  
        // Removing an item  
        try {  
            System.out.println("\nRemoving item with ID B002:");  
            catalog.removeItem("B002");  
            System.out.println("Item removed successfully.");  
        } catch (Exception e) {  
            System.out.println(e.getMessage());  
        }  
  
        // Display the catalog after removal  
        System.out.println("\nCatalog after removing an item:");  
        catalog.displayCatalog();  
  
        // Testing error handling for removing a non-existent item  
        try {  
            System.out.println("\nAttempting to remove item with ID B003:");  
            catalog.removeItem("B003");  
        } catch (Exception e) {  
            System.out.println(e.getMessage());  
        }  
  
        // Testing addition of another item  
        LibraryItem magazine1 = new LibraryItem("National Geographic", "Various", "M001");  
        catalog.addItem(magazine1);  
  
        // Display the catalog after adding another item  
        System.out.println("\nCatalog after adding another item:");  
        catalog.displayCatalog();  
    }  
}  
