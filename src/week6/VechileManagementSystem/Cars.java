package week6.VechileManagementSystem;

public class Cars extends Vechile {
    private int noOfDoors;

    public Cars(String BrandName, Double MaxSpeed, int noOfDoors) {
        super(BrandName, MaxSpeed);
        this.noOfDoors = noOfDoors;
    }
    @Override
    public void details(){
        super.details();
        System.out.println("the number of doors is "+ " " + noOfDoors );
//        return false;
    }
}
