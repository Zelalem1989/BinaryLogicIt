package absTwo;

public class BankApp {

    public static void main(String[] args){


        CheckingAccount checkingAccount = new CheckingAccount(1500);

        checkingAccount.deposit(1000);

        checkingAccount.withdraw(2000);


        System.out.println("Checking Account Balance: " + checkingAccount.balance);



        SavingAccount savingAccount = new SavingAccount(20000);

        savingAccount.deposit(50000);

        savingAccount.withdraw(1000);


        System.out.println("Saving Account Balance: " + savingAccount.balance);



        // upcasting but can not create object of the Abstract class
        Account sAccount = new SavingAccount(1200);

        Account[] accounts = new Account[3];

        accounts[0] = checkingAccount;
        accounts[1] = savingAccount;
        accounts[2] = sAccount;

        // how to run it with for each
        //accounts.for enter for shortcut
        for (int i = 0; i < accounts.length; i++) {

            System.out.println(accounts[i]);

        }
    }
}
