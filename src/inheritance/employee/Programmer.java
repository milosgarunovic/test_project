package inheritance.employee;

import java.util.ArrayList;

public class Programmer extends Employee {

    private ArrayList<String> programmingLanguages = new ArrayList<>();

    public Programmer() {
    }

    public Programmer(String name, int yearsOfExperience) {
        super(name, yearsOfExperience);
    }

    public void addProgrammingLanguage(String language) {
        programmingLanguages.add(language);
    }

    public String writeCode() {
        String result = "My name is " + name +  " I write code in: ";
        for (String programmingLanguage : programmingLanguages) {
            result += programmingLanguage + ", ";
        }
        return result;
    }

    @Override
    public void sayYourName() {
        System.out.println("I'm a programmer and my name is " + name);
    }

    @Override
    public String toString() {
        return super.toString() + " " + writeCode();
    }

}
