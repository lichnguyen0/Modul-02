package vn.lich.library;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public Book() {
    }

    //get & set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }


    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }


    public String toDataString() {
        return id + "," + title + "," + author + "," + isBorrowed;
    }


    public static Book fromDataString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            return new Book(parts[0].trim(), parts[1].trim(), parts[2].trim());
        }
        return null;
    }
}
