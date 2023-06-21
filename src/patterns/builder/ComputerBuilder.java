package patterns.builder;

public class ComputerBuilder {

    private String brand;

    private int numberOfCores;

    private int RAM;

    private int memory;

    public ComputerBuilder(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getRAM() {
        return RAM;
    }

    public int getMemory() {
        return memory;
    }

    public ComputerBuilder numberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
        return this;
    }

    public ComputerBuilder RAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public ComputerBuilder memory(int memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
    
}
