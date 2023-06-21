package patterns.builder;

// Example in JDK StringBuilder
public class Computer {

    private String brand;

    private int numberOfCores;

    private int RAM;

    private int memory;

    public Computer(ComputerBuilder builder) {
        this.brand = builder.getBrand();
        this.numberOfCores = builder.getNumberOfCores();
        this.RAM = builder.getRAM();
        this.memory = builder.getMemory();
    }

    private Computer(Builder builder) {
        this.brand = builder.brand;
        this.numberOfCores = builder.numberOfCores;
        this.RAM = builder.RAM;
        this.memory = builder.memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public static class Builder {

        private String brand;

        private int numberOfCores;

        private int RAM;

        private int memory;

        // required things for the object
        public Builder(String brand) {
            this.brand = brand;
        }

        // setter vs builder (builder is one method below)
//        public void setNumberOfCores(int numberOfCores) {
//            this.numberOfCores = numberOfCores;
//        }

        public Builder numberOfCores(int numberOfCores) {
            this.numberOfCores = numberOfCores;
            return this;
        }

        public Builder RAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder memory(int memory) {
            this.memory = memory;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

}
