package inheritance.employee;

import inheritance.employee.Employee;
import inheritance.employee.Manager;
import inheritance.employee.Programmer;

import java.util.ArrayList;

public class EmployeesMain {

    public static void main(String[] args) {
//        Employee firstEmployee = new Employee("a", 1);
//        System.out.println(firstEmployee);

// TODO garbage collector
        final Programmer programmer = new Programmer("b", 2);
        programmer.addProgrammingLanguage("Java");
        System.out.println(programmer);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer);

        Employee manager = new Manager("c", 5, 10);
        employees.add(manager);

        Employee programmer2 = new Programmer("programmer2", 3);
        // instanceof
        doSomethingWithPolymorphism(programmer2);
        doSomethingWithPolymorphism(manager);

        for (Employee employee : employees) {
            employee.sayYourName();
        }
    }

    public static void doSomethingWithPolymorphism(Employee employee) {
        if (employee instanceof Programmer) {
            // type inference
            ((Programmer) employee).addProgrammingLanguage("C#");
        } else if (employee instanceof Manager) {
            ((Manager) employee).scheduleAMeeting();
        }
    }
}
