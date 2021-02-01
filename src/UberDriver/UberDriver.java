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
        this.gasLevel = gasLevel;
        if (gasLevel > tankCapacity)
            this.gasLevel = tankCapacity;
        this.name = name;
        this.milesPerGallon = milesPerGallon;
        this.balance = balance;
        this.costPerGallon = costPerGallon;

    }

    public UberDriver(String name, int balance, double gasLevel) {

    }

    public double getGas(int distanceFromGasStop) {
        gasLevel = gasLevel - distanceFromGasStop / milesPerGallon;
        if (gasLevel < 0) {
            System.out.println("Not enough gas to reach gas station, find gas station with different distance");
            return -1;
        }
        balance -= costPerGallon * (tankCapacity - gasLevel);
        gasLevel = tankCapacity;
        return gasLevel;
    }

    public void pickUp(int distanceFromDestination, int numberPicked) {
        traveling(distanceFromDestination,numberPicked);
    }

    public void dropOff(int distanceFromDestination, int numberDropped) {
        traveling(distanceFromDestination, numberDropped);
    }

    private void traveling(int distanceFromDestination, int numberDropped) {
        if (numberDropped < 0) {
            System.out.println("Invalid amount of passengers");

        }else if(passengerNum + numberDropped > seats) {
            System.out.println("Not enough space to fit all passengers");
            passengerNum = seats;
            gasLevel -= 1.0 * distanceFromDestination / milesPerGallon;
            balance += costPerMile * distanceFromDestination;
        } else {
            passengerNum += numberDropped;
            gasLevel -= 1.0 * distanceFromDestination / milesPerGallon;
            balance += costPerMile * distanceFromDestination;
        }
    }

    public String toString() {
        return String.format("Pay Rate: %.2f\nCurrent Passenger Number: %d\nVehicle Seats: %d\nTank Capacity: %.5f\nGas Level: %.2f\nName: %s\nBalance: %.2f"
                , costPerMile, passengerNum, seats, tankCapacity, gasLevel, name, balance);
    }


}
