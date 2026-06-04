package Week5.Oop.Encapsulation;

public class User {
    private String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("invalid age");
        }else{
            this.age = age;
        }
    }

}
