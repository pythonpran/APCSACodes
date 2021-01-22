package APCSAQuestions;

public class Banking {
    public static void main(String[]args){
        BankAcct account1 = new BankAcct(400.12345);
        account1.deposit(34.3654);

        BankAcct account2 = new BankAcct(2958.34356);
        account2.deposit(234.3454);

        account2.transfer(account1,1000, true);

        System.out.println("Account1 " + account1);
        System.out.println("Account2 " + account2);
        System.out.println("hello");
    }
}
