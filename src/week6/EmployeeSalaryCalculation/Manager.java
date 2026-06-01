package week6.EmployeeSalaryCalculation;

public class Manager extends Employee{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double getBaseSalary(){
        double base_salary=super.getBaseSalary();
        return base_salary+100.00;
    }
}
