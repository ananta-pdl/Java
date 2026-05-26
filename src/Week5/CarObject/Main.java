package Week5.CarObject;

public class Main {
    static void main(String[] args) {
        Car car1=new Car();
        car1.brand="Brand ";
        car1.model="Ferrari";
        car1.year=2025;
        car1.price=672343332.12;
        car1.printDetail();

        // car 2
        Car car2=new Car();
        car2.brand="Brand ";
        car2.model="Toyota";
        car2.year=2025;
        car2.price=212343332.12;
        car2.printDetail();
    }
}
