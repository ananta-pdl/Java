package Week5.MedicalRecord;

public class Main {
    public static void main(String[] args) {
        Patient patient=new Patient("milan",20);
        patient.setMedicalRecord("appendix operation","doctor");
        System.out.println(patient.getMedicalRecord());

    }
}
