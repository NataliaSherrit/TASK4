package Gift;

public class Chocolate extends Gift {
    private  String color;
    public Chocolate(){}

    public Chocolate(Double price, Double weight, String brand, String color) {
        super(price, weight, brand);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Chocolate " + "[" + super.toString() + ", color = " + color + "]";
    }
}
