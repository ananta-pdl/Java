package week6.VechileManagementSystem;

public class Bike extends Vechile {
    private String TypeOfHandbreaker;

    public Bike(String BrandName, Double MaxSpeed, String typeOfHandbreaker) {
        super(BrandName, MaxSpeed);
        this.TypeOfHandbreaker = TypeOfHandbreaker;
    }
    @Override
    public void details(){
        super.details();
        System.out.println("type of handbraker"+ TypeOfHandbreaker);
    }
}
