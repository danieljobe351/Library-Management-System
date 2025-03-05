import java.util.*;
public class Library {
    private List<Book> books;
    public List<Memebr> memebrs;

    public Library() {
        this.books = new ArrayList<>();
        this.memebrs = new ArrayList<>();

    }
    public void addBook(Book book) {
        this.books.add(book);
        System.out.println("Book :" + book.getTitle() + " added to the library");

    }
    public void addMemebr(Memebr memebr) {
        this.memebrs.add(memebr);
        System.out.println("Member: " + memebr.getMemebrName() + " added to the library");

    }
    public void removeBook(Book book) {
        this.books.remove(book);
        System.out.println("Book :" + book.getTitle() + " removed from the library");

    }
    public void removeMemebr(Memebr memebr) {
        this.memebrs.remove(memebr);
        System.out.println("Member: " + memebr.getMemebrName() + " removed from the library");

    }
    public void publishBook(int bookId, int memebrId) {
        Book book = books.stream().filter(b -> b.getId() == bookId).findFirst().orElse(null);
        if (book == null) {
            System.out.println("Book not found");
            return;

        }
        if(book.isIssued())
        {
            System.out.println("Book already issued");

            return;

        }
        Memebr memebr = memebrs.stream().filter(memebr1 -> memebr1.getMemebrId() == memebrId).findFirst().orElse(null);
        if (memebr == null) {
            System.out.println("Member not found");
            return;

        }
        book.setPublished(true);

        memebr.getBorrowed().add(book);
        System.out.println("Book :" + book.getTitle() + " issued to " + memebr.getMemebrName());

    }
    public void printBooks() {
        System.out.println("Books available in library: ");
        for (Book book : books) {
            System.out.println(book);
        }

    }
    public void printMemebrs() {
        System.out.println("Members of the library: ");
        for (Memebr memebr : memebrs) {
            System.out.println(memebr);
        }
    }
    public void returnBook(int bookId, int memebrId) {
        Memebr memebr = memebrs.stream().filter(memebr1 -> memebr1.getMemebrId() == memebrId).findFirst().orElse(null);
        if (memebr == null) {
            System.out.println("Book not found");
            return;

        }
        Book book = books.stream().filter(b -> b.getId() == bookId).findFirst().orElse(null);
        if (book == null) {
            System.out.println("Book not borrowed by this member");
            return;

        }
        book.setPublished(false);
        memebr.getBorrowed().remove(book);
        System.out.println("Book :" + book.getTitle() + " returned by " + memebr.getMemebrName());


    }
}
