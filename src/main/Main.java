package main;

import classes.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // basic types - primitive types
        // int, short, byte, long
        // float and double
        // boolean
        // char - character

        int firstVariable = 0; // camel case - camelCaseWouldBeWrittenLikeThis
        System.out.println(firstVariable);

        long longVar = 1L;
        System.out.println(longVar);

        char firstNameChar = 'm';

        final double PI = 3.14; // upper case _ MAX_VALUE
        // variables var
        // values  val - final

        double result = (double) 5 / 3;
        System.out.println(result);

        String name = "Milos" + " Garunovic";

        System.out.println(name);
        System.out.println(name.charAt(0));

        System.out.println(name.equals("Milos Garunovic"));
        System.out.println(name + "\t\t.\n!\\"); // escape sequences
        // string pool
        // pool [ "Milos" "Milos Garunovic" "third" ]

        // task1 -> write an app to convert celsius to fahrenheit
        // F = (9/5)*C + 32
        final int BASE = 32;
        final double FACTOR = 9.0 / 5;

        int celsius = 24; // degrees
        double fahrenheit = FACTOR * celsius + BASE;
        System.out.println("Temperature in fahrenheit is " + fahrenheit + "; in celsius is " + celsius);
        // end of task1

        if (name.equals("Milos Garunovic")) {
            System.out.println("It's equal");
        } else if (name.equals("Garunovic Milos")) {
            System.out.println("It's equal reversed");
        } else {
            System.out.println("it's not equal");
        }
        // && ||

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while(check) // it can run 0 or many times
        int i = 0;
//		while (true) {
//			System.out.println(i);
//			i++;
//
//			if (i == 10) {
//				break;
//			}
//		}

        // do while // must run at least 1 time
        do {
            System.out.println(i);
            i++;
        } while (i != 10);

        int[] array = new int[3];
        array[1] = 1;
        array[0] = 2;
        array[2] = 5;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Milos");
        names.add("Alex");
        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j));
        }

        for (String name1 : names) {
            System.out.println(name1);
        }

        // visibility modifier
        // 1. public - everyone can see
        // 2. private - only visible in that class
        // 3. protected - only children classes can access that
        // 4. default - it isn't written, also called package private

        doSomething();
        int x = 5;
        int sum = sum(x, 3);
        System.out.println("---");
        System.out.println(x);
        System.out.println(sum);
        System.out.println("---");
        System.out.println(sum(5, 3));

        int age = 18;
        switch (age) {
            case 18:
                System.out.println("Age is 18");
                break;
            case 20:
                System.out.println("Age is 20");
                break;
            default:
                System.out.println("default");
        }

        User milos = new User();
        milos.setName("Milos Garunovic");
        milos.setPassword("password123");
        System.out.println(milos.getUsername());
// null
        User alex = new User("alex", "alexpass", "Alex");
        System.out.println(alex.getPassword());

        alex.changePassword("AlexPass123!"); // instance level method
        System.out.println(alex.getPassword());
        System.out.println(alex);
        User.doSomething(); // class level method
        System.out.println(User.FIELD);

        ArrayList<Integer> intArray = new ArrayList<>();
        // int Integer
        for (int integer : intArray) {
            System.out.println(integer);
        }


    }

    // visibility modifier
    // 1. public - everyone can see
    // 2. private - only visible in that class
    // 3. protected - only children classes can access that
    // 4. default - it isn't written, also called package private

    // void - type that does nothing
    private static void doSomething() {
        System.out.println("Hello from doSomething");
    }

    // visibility modifier, static/non static, return type, method name, (parameter)
    private static int sum(int x, int y) {
        doSomething();
        x = 10;
        return x;
    }

}