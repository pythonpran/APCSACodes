package Unit5Fr;

public class BankAccount{
    private String id;
    private double balance;

    public BankAccount( String id){
        this.id = id;
        this.balance = 0;
    }

    public String toString(){
        return "id: " + this.id + ", balance: $" + this.balance;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new RuntimeException("Cannot add a negative amount.");
        }
        this.balance = amount;
    }

    // My Code
    public double withdraw( double amount){
        if(this.balance < 0){
            System.out.println("Not enough balance in account to withdraw money");
            return 0;
        }else if(amount < 0){
            System.out.println("Cannot withdraw a negative amount");
            return 0;
        }
        balance -= amount;
        return amount;
    }
}
