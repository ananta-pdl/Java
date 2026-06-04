package Week5.MedicalRecord;

public class Patient {
    private String name;
    private int age;
    private String medicalRecord;


    public Patient(String name,int age){
        this.name=name;
        this.age=age;
    }

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

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord,String doctor) {
        if (doctor.equalsIgnoreCase("doctor")){
            this.medicalRecord=medicalRecord;
        }else{
            System.out.println("You dont have permission to access this::");
        }
    }
}

