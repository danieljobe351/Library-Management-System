import java.util.*;
public class Memebr {
    private int memebrId;
    private String memebrName;
    private ArrayList<Book> borrowed;

    public Memebr(int memebrId, String memebrName) {
        this.memebrId = memebrId;
        this.memebrName = memebrName;
        this.borrowed = new ArrayList<>();

    }
    public int getMemebrId() {
        return memebrId;

    }
    public String getMemebrName() {
        return memebrName;
    }
    public List<Book> getBorrowed() {
        return borrowed;
    }

    @Override
    public String toString() {
        return "ID " + memebrId + " Name" + memebrName + " Borrowed" + borrowed;
    }
}
