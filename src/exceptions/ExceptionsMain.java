package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsMain {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0); // exits
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            System.out.println("this is handled");
        }

        try {
            throwExceptionOnBadParameter(null);
        } catch (IllegalArgumentException exception) {
            System.out.println("throwExceptionOnBadParameter is handled");
        }
        System.out.println("This will be called");

        List<String> names = new ArrayList<>();
        try {
            names.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException handled");
        }

        System.out.println("---");
        try {
            scannerMethod();
        } catch (FileNotFoundException e) {
            System.out.println("handled FileNotFoundException");
        } finally {
            System.out.println("finally block");
        }
    }

    // uncaught exception or unchecked exception
    public static void throwExceptionOnBadParameter(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        System.out.println("This should be called");
    }

    public static void scannerMethod() throws FileNotFoundException {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }

}
