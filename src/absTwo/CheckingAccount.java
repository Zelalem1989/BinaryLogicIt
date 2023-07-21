package absTwo;

public class CheckingAccount extends Account{

    public CheckingAccount(double balance) {

        // calling the Abstract parent class
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {

        if(balance + 100 < amount){ // $100 for overdraft protection
            System.out.println("Insufficient Funds!! ");
        }
        else
            balance -= amount;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                '}';
    }
}
