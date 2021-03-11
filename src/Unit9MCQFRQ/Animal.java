package Unit9MCQFRQ;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String diet, String species, String name){
        this.diet = diet;
        this.species = species;
        this.name = name;
    }

    public String toString(){
        return name + " the " + species + " is a " + diet;
    }
}
class Herbivore extends Animal{

    public Herbivore(String species, String name){
        super("herbivore", species, name);
    }
}

class Elephant extends Herbivore{
    private double tuskLength;

    public Elephant(String name, double tuskLength){
        super("elephant", "Percy");
        this.tuskLength = tuskLength;
    }

    @Override
    public String toString(){
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}