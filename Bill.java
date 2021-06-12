public class Bill {
    Burger burger;
    Bill(Burger burger){
        this.burger=burger;
    }

    @Override
    public String toString() {
        String toppings = "";
        Double cost = burger.getCost();
        for(int i=0;i<burger.toppings.size();i++){
            toppings+=(i+1)+". "+burger.toppings.get(i)+"\n";
            cost+=burger.toppings.get(i).getPrice();
        }
        return   "\n\n\tReceipt\n"
                +"\t```````\n"
                +"1."+burger.name+" - "+burger.getCost()+"\n\n"
                +"Extras:\n"
                +"```````\n"
                + toppings
                +"\n\n"
                +"----------------------------------------\n"
                +"Amount: "+String.format("%.2f",cost)+"$ + (Tax:" +String.format("%.2f",cost*.15)+"$)\n"
                +"----------------------------------------\n"
                +"Total: "+String.format("%.2f",cost*1.15)+"$";
    }
}
