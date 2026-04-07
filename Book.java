public class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    // Constructor to initialize book details
    public Book(int id, String title, String author) {
        this.id = id;   // current object
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for issued status
    public boolean isIssued() {
        return issued;
    }

    // Setter for issued status
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    // Display book information
    public void displayBook() {
        System.out.println("ID: " + id + " | Title: " + title + " | Author: " + author + " | Issued: " + issued);
    }
}