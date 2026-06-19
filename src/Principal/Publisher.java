package Principal;

public class Publisher {
    private String name;
    private String country;

    public Publisher(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getPais() {
        return country;
    }

    public void setPais(String country) {
        this.country = country;
    }
}
