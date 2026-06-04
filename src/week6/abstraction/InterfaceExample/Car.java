package week6.abstraction.InterfaceExample;

public class  Car implements Vechile,fourwheeler {
    @Override
    public void start() {
        System.out.println("gadi kudyo:::");
    }

    @Override
    public void end() {
        System.out.println("gadi rokyo::::");
    }

    @Override
    public void engine() {
        System.out.println("engine vayo hai:::");
    }

    @Override
    public void brake() {
        System.out.println("brake lagyo");
    }
}
