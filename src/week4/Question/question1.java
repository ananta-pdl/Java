package week4.Question;

public class question1 {
    public static void totalcost(double[] prices) {
        double totalprice = 0;
        for (double price : prices) {
            totalprice += price;
        }
        double finalprice = 0;
        if (totalprice > 1000) {
            finalprice = totalprice - (totalprice * 20 / 100);
        } else if (totalprice <= 1000 && totalprice > 600) {
            finalprice = totalprice - (totalprice * 10 / 100);
        } else {
            finalprice = totalprice;
        }
        System.out.println(finalprice);
    }

    public static void main(String[] args) {

    }
}
