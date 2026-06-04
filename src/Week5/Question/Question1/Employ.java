package Week5.Question.Question1;

public class Employ {
    static String company_name="abc company";
    static  int counter=0;
    private String name;
    private double Salary;

    public  Employ(String name){
        this.name=name;
        Employ.counter+=1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary,String department_name) {
        if (department_name.equalsIgnoreCase("HR")){
            this.Salary=salary;

        }else {
            System.out.println("you dont have permissiom");
        }
    }
    public String getCompany_name(){
        return Employ.company_name;
    }
    public int getCounter(){
        return Employ.counter;
    }
}

//py version
//class Employ:
//def __init__(self, name, salary):
//self.name = name
//self.salary = salary
//
//    # Getter for name
//def get_name(self):
//        return self.name
//
//    # Setter for name
//def set_name(self, name):
//self.name = name
//
//    # Getter for salary
//def get_salary(self):
//        return self.salary
//
//    # Setter for salary
//def set_salary(self, salary, department_name):
//self.salary = salary