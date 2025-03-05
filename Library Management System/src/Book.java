import java.util.*;
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean issued;

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;


    }
    public int getId() {
        return id;

    }
    public void setId(int id) {
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
    public boolean isIssued() {
        return issued;
    }
    public void setPublished(boolean issued) {
        this.issued = issued;

    }
    public String toString(){
        String st = issued ? "Issued" : "UnIssued";
        return "Book ID: " + id + " Book Title: " + title + " Author: " + author + " Issued: " + st;
    }


}
