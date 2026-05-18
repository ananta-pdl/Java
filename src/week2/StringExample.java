package week2;


public class StringExample {
    public static void main(String[] args) {
        String name="milan"; // string pool
        String name2= new String("milan");
        String name4= new String("milan");
        String name3= "milan";


        System.out.println(name+" "+name2);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(2));
        System.out.println(name2.equals(name4));


        String text= "Java programming";
        System.out.println(text.substring(6));
        System.out.println(text.substring(5,8));

    }
}
