package Principal;

public abstract class Person {
    private String name;
    private String email;

    public Person(String nome, String email) {
        this.name = nome;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
