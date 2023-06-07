package main;

import classes.Author;
import classes.Book;
import classes.Publisher;
import classes.Type;

public class BooksMain {

    public static void main(String[] args) {
        Publisher publisher1 = new Publisher("Publisher 1", "Germany");
        Book atomicHabits = new Book("Atomic Habits", publisher1);
        Author jamesClear = new Author("James Clear");
        atomicHabits.getAuthors().add(jamesClear);
        atomicHabits.getAuthors().add(new Author("Other author"));
        atomicHabits.addAuthor(new Author("Third author"));
        atomicHabits.setType(Type.SELF_HELP);

        for (Author author : atomicHabits.getAuthors()) {
            System.out.println(author);
        }
        System.out.println(atomicHabits);
        // pass by value - work with duplicates - primitive types
        // pass by type/reference - which works with objects and changes them directly
    }

}
