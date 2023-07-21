package absTwo;

// this is an abstract class
//this is a concrete class (all its methods are implemented)

public abstract class Account {

    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //abstract method
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

//    @Override
//    public String toString() {
//        return "Account{" +
//                "balance=" + balance +
//                '}';
//    }
}
