package UberDriver;

public class UberDriver {
    private double costPerMile;
    private int milesPerGallon;
    private String name;

    private double balance;
    private double tankCapacity;
    private double gasLevel;

    private int passengerNum;
    private int seats;
    private double costPerGallon;

    public UberDriver(String name, int seats, double costPerMile, int milesPerGallon, int tankCapacity, int balance, int gasLevel, double costPerGallon) {
        this.costPerMile = costPerMile;
        this.seats = seats;
        this.tankCapacity = tankCapacity;
        this.gasLevel  = gasLevel;
        if(gasLevel > tankCapacity)
            this.gasLevel = tankCapacity;
        this.name = name;
        this.milesPerGallon = milesPerGallon;
        this.balance = balance;
        this.costPerGallon = costPerGallon;

    }

    public UberDriver(String name, int balance, double gasLevel){

    }

    public double getGas(int distanceFromGasStop){
        double difference = gasLevel - tankCapacity - distanceFromGasStop * milesPerGallon;
        if(difference < 0){
            System.out.println("Not enough gas to reach gas station, find gas station with different distance");
            return -1;
        }
        balance -= costPerGallon * difference;
        gasLevel = tankCapacity;
        return gasLevel;
    }

    public void pickUp(int distanceFromDestination,int numberPicked){
        if(numberPicked < 0 ){
            System.out.println("Invalid amount of passengers");

        }if(passengerNum + numberPicked > seats){
            System.out.println("Not enough space to fit all passengers");
            passengerNum = seats;
        }else{
            passengerNum += numberPicked;
        }

        gasLevel -= distanceFromDestination / milesPerGallon;
        balance += costPerMile * distanceFromDestination;
    }

    public void dropOff(int distanceFromDestination, int numberDropped){
        if(numberDropped < 0 ){
            System.out.println("Invalid amount of passengers");

        }if(passengerNum + numberDropped > seats){
            System.out.println("Not enough space to fit all passengers");
            passengerNum = seats;
        }else{
            passengerNum += numberDropped;
        }

        gasLevel -= distanceFromDestination / milesPerGallon;
        balance += costPerMile * distanceFromDestination;

    }

    private void traveling(int distanceFromDestination, int amount){

    }

    public String toString(){
        return String.format("Pay Rate: %d\nPassenger Number: %d",costPerMile,passengerNum);
    }





}
