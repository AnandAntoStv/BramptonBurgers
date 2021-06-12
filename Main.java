public class Main {
    public static void main(String[] args) {
        Restaurant.displayBurgersMenu();

        Topping t = new Topping("Tomato",(Double)0.27);
        BasicBurger b= new BasicBurger("BasicBurger with White with Chicken",(Double)3.56,4,"Chicken");
    }
}
