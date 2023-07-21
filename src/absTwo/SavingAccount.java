package absTwo;

public class SavingAccount extends Account{

    public SavingAccount(double balance) {
        // calling the Abstract parent class
        super(balance);
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }
    @Override
    public void withdraw(double amount){

        if(balance < amount){ // why cant he withdraw all the money in amount =< balance
            System.out.println("Insufficient funds!!  ");
        }
        else
            balance -= amount;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "balance=" + balance +
                '}';
    }
}
