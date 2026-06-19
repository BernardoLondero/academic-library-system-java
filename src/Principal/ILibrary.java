package Principal;

import java.util.ArrayList;

public interface ILibrary {

    void addPublication(Publication p);

    //Usei o title pois não entendi o ID
    boolean removePublication(long id);

    ArrayList<Publication> getAllPublications();

    short countPublications();

    Publication findPublication(String title);

    boolean hasPublication(String title);
}