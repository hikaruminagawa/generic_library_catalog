import java.util.HashMap;
import java.util.Map;

public class GenericCatalog<T extends LibraryItem> {
    private Map<String, T> catalog; // Map to store items with their unique IDs

    public GenericCatalog() {
        catalog = new HashMap<>(); // Initialize the catalog as a HashMap
    }

    public void addItem(T item) {
        catalog.put(item.getItemID(), item); // Add an item to the catalog using its ID as the key
    }

    public void removeItem(String itemID) throws Exception {
        if (!catalog.containsKey(itemID)) { // Check if the item with the given ID exists in the catalog
            throw new Exception("Item with ID " + itemID + " does not exist."); // Throw an exception if the item doesn't exist
        }
        catalog.remove(itemID); // Remove the item from the catalog
    }

    public T getItem(String itemID) {
        return catalog.get(itemID); // Retrieve the item with the given ID from the catalog
    }

    public void displayCatalog() {
        for (T item : catalog.values()) { // Iterate over all the items in the catalog
            System.out.println(item); // Print each item
        }
    }
}
