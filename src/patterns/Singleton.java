package patterns;

public class Singleton {

    // eager init
//    private static Singleton instance = new Singleton();

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        // lazy init
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doStuff() {
        System.out.println("printing...");
    }
}
