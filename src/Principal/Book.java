package Principal;

import java.util.ArrayList;


public class Book extends Publication {
    private String lenguage;
    private long isbn;
    private short pages;

    public Book(String lenguage, long isbn, short pages, String title, short year, byte volume, ArrayList<Author> authors) {
        super(title, year, volume, authors);
        this.lenguage = lenguage;
        this.isbn = isbn;
        this.pages = pages;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }
}
