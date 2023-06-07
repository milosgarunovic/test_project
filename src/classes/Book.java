package classes;

import java.util.ArrayList;

public class Book {

    private String title;

    private Type type;

    private Publisher publishingHouse;

    private ArrayList<Author> authors = new ArrayList<>();

    public Book(String title, Publisher publishingHouse) {
        this.title = title;
        this.publishingHouse = publishingHouse;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }
    
    // override
    // overload
    // same return type and same name
    @Override
    public String toString() {
        String authorsString = "";
        for (Author author : authors) {
            authorsString += author.toString() + " ";
        }
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authorsString +
                ", publisher=" + publishingHouse +
                ", type=" + type +
                '}';
    }

}
