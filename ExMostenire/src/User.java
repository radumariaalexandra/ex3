public class User {
    private String name;
    private String email;
    private char sex;
    private String phoneNumber;
    public User(String name, String email, char sex, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public char getSex() {
        return sex;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
