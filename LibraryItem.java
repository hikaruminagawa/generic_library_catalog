public class LibraryItem {  // Defines a public class named LibraryItem

    private String title;  // Declares a private instance variable named title of type String
    private String author;  // Declares a private instance variable named author of type String
    private String itemID;  // Declares a private instance variable named itemID of type String

    public LibraryItem(String title, String author, String itemID) {  // Defines a constructor that takes three parameters: title, author, and itemID
        this.title = title;  // Assigns the value of the title parameter to the title instance variable
        this.author = author;  // Assigns the value of the author parameter to the author instance variable
        this.itemID = itemID;  // Assigns the value of the itemID parameter to the itemID instance variable
    }

    public String getTitle() {  // Defines a public method named getTitle that returns a String
        return title;  // Returns the value of the title instance variable
    }

    public String getAuthor() {  // Defines a public method named getAuthor that returns a String
        return author;  // Returns the value of the author instance variable
    }

    public String getItemID() {  // Defines a public method named getItemID that returns a String
        return itemID;  // Returns the value of the itemID instance variable
    }

    @Override  // Indicates that the following method overrides a method from the superclass
    public String toString() {  // Overrides the toString method from the Object class
        return "Title: " + title + ", Author: " + author + ", ID: " + itemID;  // Returns a formatted string representation of the LibraryItem object
    }
}
