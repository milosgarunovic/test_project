package inheritance.employee;

import inheritance.entity.Entity;

// abstract = cannot instantiate for class
//   for method = you need to override it/implement it in derived/child class
public abstract class Employee extends Entity {

    protected String name; // protected is visible in package and derived/children classes

    protected int yearsOfExperience;

    public Employee() {
    }

    public Employee(String name, int yearsOfExperience) {
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        sayYourName();
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public abstract void sayYourName();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

}
