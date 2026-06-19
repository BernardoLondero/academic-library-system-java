package Principal;

public class Journal {
    private Publisher publisher;
    private String name;
    private byte impactFactor;

    public Journal(Publisher publisher, String name, byte impactFactor) {
        this.publisher = publisher;
        this.name = name;
        this.impactFactor = impactFactor;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(byte impactFactor) {
        this.impactFactor = impactFactor;
    }
}
