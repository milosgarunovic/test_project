package classes;

public class User {

    // attribute/property/field
    private String username;

    private String password;

    private String name;

    public final static String FIELD = "something";

    // default constructor
    public User() {
    }

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public User(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public void changePassword(String newPassword) {
        if (newPassword.equals(password)) {
            System.out.println("new password can't be the same as old password");
            return;
        }
        password = newPassword;
    }

    // encapsulation - 1 / 4 principles of OOP (object oriented programming)
    // expose only what you need with getters and setters
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return "******";
    }

    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + username;
    }

    // method in java not function
    public static void doSomething() {
        System.out.println("doSomething static");
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
