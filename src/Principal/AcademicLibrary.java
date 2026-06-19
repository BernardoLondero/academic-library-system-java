package Principal;

import java.util.ArrayList;

public class AcademicLibrary implements ILibrary {
    private String name;
    private String description;
    private String creationDate;
    private ArrayList<User> users;
    private ArrayList<Publication> publications;

    public AcademicLibrary(String name, String description, String creationDate) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.users = new ArrayList<>();
        this.publications = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }
    
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }
    
    public short countArticles() {
        short count = 0;
        for (Publication p : this.publications) {
            if (p instanceof Article) {
                count++;
            }
        }
        return count;
    }

    public short countBooks() {
        short count = 0;
        for (Publication p : this.publications) {
            if (p instanceof Book) {
                count++;
            }
        }
        return count;
    }
    
    @Override
    public Publication findPublication(String title) {
        for (Publication p : this.publications) {
            if (p.getTitle().equalsIgnoreCase(title)) {
                return p;
            }
        }
        return null;
    }

    public Article findArticle(long issn) {
        for (Publication p : publications) {
            if (p instanceof Article a && a.getIssn()== issn) {
                return a;
            }
        }
        return null;
    }

    public Article findArticle(String title) {
        Publication p = this.findPublication(title);
        if (p != null && p instanceof Article) {
            return (Article) p;
        }
        return null;
    }

    public Book findBook(long isbn) {
        for (Publication p : publications) {
            if (p instanceof Book b && b.getIsbn()== isbn) {
                return b;
            }
        }
        return null;
    }

    public Book findBook(String title) {
        Publication p = this.findPublication(title);
        if (p != null && p instanceof Book) {
            return (Book) p;
        }
        return null;
    }
    
    @Override
public void addPublication(Publication p) {
    this.publications.add(p);
}

@Override
public boolean removePublication(long id) {
    // Percorre todas as publicações armazenadas na biblioteca
    for (int i = 0; i < publications.size(); i++) {
        Publication p = publications.get(i);

        if (p instanceof Book) {
            Book b = (Book) p;
            if (b.getIsbn() == id) {
                publications.remove(i);
                return true;
            }
        }

        if (p instanceof Article) {
            Article a = (Article) p;
            if (a.getIssn() == id) {
                publications.remove(i);
                return true;
            }
        }
    }

    return false; 
}

    @Override
public ArrayList<Publication> getAllPublications() {
    return this.publications;
}

    @Override
public short countPublications() {
    return (short) this.publications.size();
}

    @Override
public boolean hasPublication(String title) {
    return findPublication(title) != null;
}
}