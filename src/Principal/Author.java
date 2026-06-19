package Principal;

public class Author extends Person {
    private String afiliation;
    private boolean isCorrespondingAuthor;

    public Author(String afiliation, boolean isCorrespondingAuthor, String nome, String email) {
        super(nome, email);
        this.afiliation = afiliation;
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }

    public String getAfiliation() {
        return afiliation;
    }
    
    public void setAfiliation(String afiliation) {
        this.afiliation = afiliation;
    }

    public boolean getIsCorrespondingAuthor() {
        return isCorrespondingAuthor;
    }

    public void setIsCorrespondingAuthor(boolean isCorrespondingAuthor) {
        this.isCorrespondingAuthor = isCorrespondingAuthor;
    }
}