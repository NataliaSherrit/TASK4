import Gift.Candy;
import Gift.Chocolate;
import Gift.Gift;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy(2.5, 4.1, "Lollipop", "caramel");
        Chocolate chocolate1 = new Chocolate(10.6,8.0,"Milka", "White");
        Chocolate chocolate2 = new Chocolate();
        chocolate2.setColor("Black");
        chocolate2.setBrand("Alpen Gold");
        chocolate2.setPrice(15.10);
        chocolate2.setWeight(21.9);

        Gift[] box = {candy1,chocolate1,chocolate2};
        double totalBoxPrice = candy1.getPrice() + chocolate1.getPrice() + chocolate2.getPrice();
        double totalBoxWeight = candy1.getWeight() + chocolate1.getWeight() + chocolate2.getWeight();
        for (Gift someGift: box) {
            System.out.println(someGift.toString());
        }
        System.out.println("Total box price = " + totalBoxPrice);
        System.out.println("Total box weight = " + totalBoxWeight);


    }
}
