package Principal;

import java.util.ArrayList;

public abstract class Publication {
    private String title;
    private short year;
    private byte volume;
    private ArrayList<Author> authors;

    public Publication(String title, short year, byte volume, ArrayList<Author> initialAuthors) {
       
                if (initialAuthors == null || initialAuthors.isEmpty()) {
            throw new IllegalArgumentException("Deve conter pelo menos um autor.");
        }
                
        this.title = title;
        this.year = year;
        this.volume = volume;
        this.authors = initialAuthors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getVolume() {
        return volume;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}
