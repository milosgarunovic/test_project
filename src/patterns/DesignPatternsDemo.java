package patterns;

import patterns.builder.Computer;
import patterns.builder.ComputerBuilder;
import patterns.factory.*;

import java.util.Arrays;
import java.util.List;

public class DesignPatternsDemo {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.doStuff();

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        Shape shape2 = new Square();


        Computer.Builder dell = new Computer.Builder("Dell")
                .RAM(16)
                .memory(512);

        // logic...
        dell.numberOfCores(calculateNumberOfCores());

        Computer build = dell.build();

        Computer build1 = new Computer.Builder("Apple")
                .RAM(16)
                .memory(512)
                .numberOfCores(6)
                .build();

        Computer build2 = new ComputerBuilder("").memory(0).build();

        List<String> strings = Arrays.asList("a", "b", "c");

        String result = "0";
        for (String string : strings) {
            result += string;
        }
        System.out.println(result);

        StringBuilder stringBuilder = new StringBuilder("0");
        for (String string : strings) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder);
    }

    public static int calculateNumberOfCores() {
        return 4;
    }
}
