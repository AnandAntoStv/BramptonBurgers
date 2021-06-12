import java.util.Scanner;

public class Restaurant {
    static Burger[] burgers = {new BasicBurger("Basic with White",3.56,4,"Chicken"),
            new HealthyBurger("Healthy with Brown Rye",5.67,6,"Bacon"),
            new DeluxeBurger("Deluxe with White",14.54,2,"Sausage")};
    static Topping[] availableToppings = {new Topping("Tomtato",0.27),
            new Topping("Lettuce",0.72),
            new Topping("Cheese",1.13),
            new Topping("Carrot",2.75) };
    Restaurant(){}

    public static void displayBurgersMenu(){
        System.out.println("\t\tBrampton Burgers");
        System.out.println("-------------------------------");
        for (int i=0;i< burgers.length;i++) {
            System.out.println((i+1)+". "+burgers[i]+"\n");
        }
        System.out.print("Select:");
        Scanner scanner = new Scanner(System.in);
        int selection;
        while(true){
            if(scanner.hasNextInt()){
                selection = scanner.nextInt();
                if(selection<1 || selection> burgers.length)
                {
                    System.out.println("Invalid Option! Please Try Again");
                    System.out.print("Select:");
                    continue;
                }
                break;
            }
            else{
                System.out.println("Invalid Input! Please Try Again");
                scanner.next();
                System.out.print("Select:");
            }
        }
        selection = selection-1;
        Burger selectedBurger = burgers[selection];
        //Toppings Menu
        System.out.println("\n\nPlease Add Some Toppings");
        for(int i=0;i<availableToppings.length;i++){
            System.out.println((i+1)+". "+availableToppings[i]);
        }
        System.out.println("0. Thats all");
        int allowedToppings = selectedBurger.maxToppings;
        do{
            System.out.print("Choose any "+ selectedBurger.maxToppings +" Toppings:");

            while(true){
                if(scanner.hasNextInt()){
                    selection = scanner.nextInt();
                    if(selection<0 || selection> availableToppings.length)
                    {
                        System.out.println("Invalid Option! Please Try Again");
                        System.out.print("Choose any "+ selectedBurger.maxToppings +" Toppings:");
                        continue;
                    }
                    break;
                }
                else{
                    System.out.println("Invalid Input! Please Try Again");
                    scanner.next();
                    System.out.print("Choose any "+ selectedBurger.maxToppings +" Toppings:");
                }
            }

            if(selection!=0){
                selectedBurger.addTopping(availableToppings[selection-1]);
                allowedToppings--;
            }
        }while(selection!=0 && allowedToppings>0);
        Bill bill = new Bill(selectedBurger);
        System.out.println(bill);
    }
}
