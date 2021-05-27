package Gift;

public abstract class Gift {
    private Double price;
    private Double weight;
    private String brand;

    public Gift(){}

    public Gift(Double price, Double weight, String brand) {
        this.price = price;
        this.weight = weight;
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", weight = " + weight + ", price = " + price;
    }
}
