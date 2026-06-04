package Week5.StudentManagement;

public class Student {
    private String name;
    private int age;
    private float marks;

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
        this.age = age;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks,String techer) {
        if (techer.equalsIgnoreCase("teacher")){
            if (marks<=0 && marks<=100){
                this.marks=marks;
            } else {
                System.out.println("invlid marks");
            }
        }else{
            System.out.println("you dont have permission!!");
        }
    }
}
