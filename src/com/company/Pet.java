package com.company;

public class Pet {
    public double height;
    public int teeth;
    public String type;

    public String isHealthy(){
        if(teeth > 10){
            return "The Dog is healthy";
        }else
            return "The Dog is not healthy";
    }

    public String dogType(){
        return type;
    }
}
