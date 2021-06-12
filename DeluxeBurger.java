public class DeluxeBurger extends Burger{
//    String filling = "Sausage";
    String filling ;
    DeluxeBurger(String name, Double price, int maxToppings, String filling){
        super(name,price,maxToppings);
        this.filling=filling;
    }
    @Override
    public String toString() {
        return name+" with "+filling+" \n   Cost:"+ "$ " +this.getCost()+"\n   Max Toppings:"+maxToppings;
    }
}
