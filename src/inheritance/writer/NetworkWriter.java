package inheritance.writer;

public class NetworkWriter implements Writer {

    @Override
    public void write() {
        System.out.println("I'm a network writer");
    }

}
