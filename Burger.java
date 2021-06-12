import java.util.ArrayList;

public class Burger {
    String name;
    Double cost;
    int maxToppings;
    ArrayList<Topping> toppings = new ArrayList<>();

    public Burger(String name, double cost, int maxToppings) {
        this.name = name;
        this.cost = cost;
        this.maxToppings = maxToppings;
    }
    public boolean addTopping(Topping topping){
        if(toppings.size() == this.maxToppings)
            return false;
        toppings.add(topping);
        return true;
    }

    public Double getCost() {
        return cost;
    }

}
