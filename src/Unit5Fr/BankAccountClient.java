package Unit5Fr;

public class BankAccountClient {
    public static void main(String[]args){
        BankAccount account = new BankAccount("Guy");

        account.deposit(100.0);
        System.out.println(account);

        System.out.println("Amount withdrawn: $" + account.withdraw(10));
        System.out.println(account);
    }
}
