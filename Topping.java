public class Topping {
    private String name;
    private Double price;

    public Topping(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " : " + "$ "+ this.getPrice();
    }
}
