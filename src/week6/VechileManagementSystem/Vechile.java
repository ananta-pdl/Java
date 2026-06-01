package week6.VechileManagementSystem;

public class Vechile {
    private String BrandName;
    private double MaxSpeed;

    public Vechile(String BrandName,Double MaxSpeed){
        this.BrandName=BrandName;
        this.MaxSpeed=MaxSpeed;
    }

    public void details(){
        System.out.println("The brandname is " + BrandName);
        System.out.println("The max speed is"+ MaxSpeed);
    }


}
