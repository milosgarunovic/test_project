package classes;

public class Author {

    private String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Author{" + "fullName='" + fullName + '\'' + '}';
    }

}
