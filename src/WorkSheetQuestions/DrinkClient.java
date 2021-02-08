package WorkSheetQuestions;

public class DrinkClient {
    public static void main(String[]args){
        Drink common = new Drink("Gatorade",true,12);
    }
}

class Drink{
    String name;
    boolean carbonated;
    int ounces;

    public Drink(String name, boolean carb, int oz){
        this.name = name;
        this.carbonated = carb;
        this.ounces = oz;
    }

    public void printDrinkLabel(boolean choice,String option1,String option2){
        if(choice){
            System.out.println(option1);
        }else{
            System.out.println(option2);
        }
    }

    public int getServingSize(){
        return ounces;
    }
}

class SugaryDrink extends Drink{
    private boolean containsJuice;

    public SugaryDrink(String name, boolean carb, int oz, boolean containsJuice) {
        super(name, carb, oz);
        this.containsJuice = containsJuice;
    }

    public void printDrinkLabel(){
        super.printDrinkLabel(containsJuice,"Contains real fruit juice!","Contains no actual juice");
    }
}

class SugarFreeDrink extends Drink{
    private boolean containArtificialSweetener;

    public SugarFreeDrink(String name, boolean carb, int oz, boolean containArtificialSweetener) {
        super(name, carb, 20);
        this.containArtificialSweetener = containArtificialSweetener;
    }

    public void printDrinkLabel(){
        super.printDrinkLabel(containArtificialSweetener,"This drink is not all natural","The drink contains no artificial sweeteners");
    }



}

class SportsDrink extends SugaryDrink{

    public SportsDrink(String name, boolean carb, boolean containsJuice, int servingSizeOunces, String electrolytes) {
        super(name, carb, servingSizeOunces, containsJuice);
    }

    public boolean equals(Object o){
        if(o instanceof SportsDrink) {
            return this.getServingSize() == ((SportsDrink) o).getServingSize();
        }else{
            return false;
        }
    }
}

