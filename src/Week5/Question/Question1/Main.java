package Week5.Question.Question1;

public class Main {
    public static void main(String[] args) {
        Employ emp_obj=new Employ("milan");
        Employ emp_obj2=new Employ("milan");
        emp_obj.setSalary(800,"hr");
        System.out.println(emp_obj.getSalary());
        System.out.println(emp_obj.getCompany_name());
        System.out.println(emp_obj.getCounter());
        System.out.println(emp_obj2.getCounter());
    }
}

//py version
//emp = Employ("John", 50000)
//
//print(emp.name)
//print(emp.salary)
//
//emp.salary = 60000
//
//print(emp)