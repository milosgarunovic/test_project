package inheritance.writer;

import java.util.ArrayList;

public class WriterMain {

    public static void main(String[] args) {
        IOWriter ioWriter = new IOWriter();
        NetworkWriter networkWriter = new NetworkWriter();
        ArrayList<Writer> writers = new ArrayList<>();
        writers.add(ioWriter);
        writers.add(networkWriter);
        for (Writer writer : writers) {
            writer.write();
        }

        printWhichInterface(ioWriter);
        printWhichInterface(networkWriter);
    }

    public static void printWhichInterface(Writer writer) {
        if (writer instanceof IOWriter) {
            System.out.println("IOWriter");
        } else if (writer instanceof NetworkWriter) {
            System.out.println("NetworkWriter");
        }
    }
}
