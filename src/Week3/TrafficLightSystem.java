package Week3;
import java.util.Scanner;
public class TrafficLightSystem {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the colour of traffic signal::");
            String TrafficLight = sc.next();

            String result = switch (TrafficLight) {
                case "Red" -> "chupa lagara gadi rokara bas";
                case "yellow" -> "gadi start garara ready vayara bas";
                case "green" -> "ja aafno bato tira";
                default -> "j paya tei colour na rakh na ";
            };
            System.out.println(result);

        }
        counter+=1;
    }
}


