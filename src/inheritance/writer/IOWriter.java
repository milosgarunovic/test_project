package inheritance.writer;

public class IOWriter implements Writer {

    @Override
    public void write() {
        System.out.println("I'm an IO Writer");
    }

}
