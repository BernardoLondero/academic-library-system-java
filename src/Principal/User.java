package Principal;

public class User extends Person {
    private String phone;
    private String login;
    private int password;

    public User(String phone, String login, int password, String nome, String email) {
        super(nome, email);
        this.phone = phone;
        this.login = login;
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }    
}
