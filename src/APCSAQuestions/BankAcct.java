package APCSAQuestions;

public class BankAcct {
    private double amount = 0;

    public BankAcct(double startingAmount){
        this.amount = Math.round(startingAmount * 100)/100;
    }

    public double deposit(double amount){
       this.amount += Math.round(amount * 100)/100;
       return amount;
    }

    public double withdraw(double amount){
        this.amount -= Math.round(amount * 100)/100;
        return amount;
    }

    // if positive, transfers money from this bank account to the other account
    public void transfer(BankAcct otherAccount, int transferAmount, boolean toOrFrom){
        if(transferAmount < 0) throw new NumberFormatException("wtf");
        int multiplier = toOrFrom ? 1 : -1;
        this.withdraw(transferAmount * multiplier);
        otherAccount.deposit(transferAmount * multiplier);
    }


    public String toString(){
        return "Amount: " + amount;
    }

}
