package BankAcct;

/*
    If you get more money that your suppose to get, you will get charged with a fee of $50
    Class invariant -
    Interest Rate - local parameter in month, what your balance will be after many months(do not need to implement a timer)

 */
public class BankAcct {
    protected String acctName;
    protected int acctNum = 0;
    protected static int lastAssignedNumber = 0;
    protected int balance;

    protected BankAcct(){
        acctNum = lastAssignedNumber;
        lastAssignedNumber++;
    }

    public String toString(){
        return "Account Name: " + acctName + " \n balance: " + acctNum;
    }
    public int withdraw(int amount){
        balance -= amount;
        return amount;
    }
    public int deposit(int amount){
        balance += amount;
        return amount;
    }
}

class SavingsAcct extends BankAcct{
    protected double interestRate = 1.01;

    @Override
    public int withdraw(int amount) {
        balance *= interestRate;
        return super.withdraw(amount);
    }

    @Override
    public int deposit(int amount) {
        balance *= interestRate;
        return super.deposit(amount);
    }
}

class CheckingAcct extends BankAcct{
    protected int transaction = 0;
    final int transactionFeeDollars = 1;

    @Override
    public int withdraw(int amount){
        transactionCalc();
        return super.withdraw(amount);
    }

    @Override
    public int deposit(int amount) {
        transactionCalc();
        return super.deposit(amount);
    }

    public void transfer(BankAcct otherAccount, int amount){
        this.withdraw(amount);
        otherAccount.deposit(amount);
    }

    private void transactionCalc(){
        transaction++;
        if(transaction > 3){
            balance -= transactionFeeDollars;
        }
    }
}