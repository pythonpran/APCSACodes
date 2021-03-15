package Unit6FRQ;

import java.util.ArrayList;

public class Pet{
    private String name;
    private String species;

    public Pet(String n, String s){
        name = n;
        species = s;
    }

    public String getName(){
        return name;
    }

    public void printPetInfo(){
        System.out.print(name + " is a " + species);
    }
}

class Dog extends Pet{
    private String breed;

    public Dog(String n, String b){
        super(n, "dog");
        breed = b;
    }

    public void printPetInfo(){
        super.printPetInfo();
        System.out.print(" of breed " + breed);
    }
}

class PetClient{
    public static void main(String[]args){
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();

        ArrayList<Pet> petList = new ArrayList<Pet>();
        Pet pet1 = new Pet("Floopy","rabbit");
        Dog pet2 = new Dog("Arty","pug");
        /* missing code */

        petList.add(pet1);

        petList.add(pet2);
        PetOwner a = new PetOwner(pet1,"Hello");
        System.out.println();
        a.printOwnerInfo();
    }
}

class PetOwner{
    private Pet thePet;
    private String owner;

    public PetOwner(Pet p, String o){
        thePet = p;
        owner = o;
    }

    public void printOwnerInfo(){
        thePet.printPetInfo();
        System.out.print(" owned by " + owner);
    }
}

