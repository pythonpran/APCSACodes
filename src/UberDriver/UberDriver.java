package UberDriver;

public class UberDriver {
    private final double costPerMile = 0.05;


    private double balance;
    private double tankCapacity;
    private double gasLevel;

    private double distance;
    private double payRate = costPerMile * distance;
    private int passengerNum;


    public UberDriver(String name, int seats, int payRate, int milesPerGallon, int tankCapacity, int balance, double gasLevel) {

    }

    public UberDriver(String name, int balance, double gasLevel){

    }

    public void getGas(){}

    public void pickUp(){}

    public void dropOff(){}

    public String toString(){
        return String.format("Pay Rate: %d\nPassenger Number: %d",payRate,passengerNum);
    }





}
