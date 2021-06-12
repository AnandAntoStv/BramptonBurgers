public class BasicBurger extends Burger{
//    String filling = "Chicken";
//    String sauce = "White";
    String filling;
    BasicBurger(String name, Double price, int maxToppings, String filling ){
        super(name,price,maxToppings);
        this.filling = filling;
    }
    @Override
    public String toString() {
        return name+" with "+filling+" \n   Cost:"+ "$ " +this.getCost()+"\n   Max Toppings:"+maxToppings;
    }

}
