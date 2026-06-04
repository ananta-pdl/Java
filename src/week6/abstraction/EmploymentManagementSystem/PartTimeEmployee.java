package week6.abstraction.EmploymentManagementSystem;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee (String name, Double salary){
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println("salary" + getSalary());

    }

    @Override
    public void displayDetails() {
        System.out.println("name" + getName());
        System.out.println("salary" + getSalary());

    }
}
