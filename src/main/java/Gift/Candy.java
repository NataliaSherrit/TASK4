package Gift;

public class Candy extends Gift {
    private String type;
    public Candy(){}

    public Candy(Double price, Double weight, String brand, String type) {
        super(price, weight, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy " + "[" + super.toString() + ", type = " + type + "]";
    }
}
