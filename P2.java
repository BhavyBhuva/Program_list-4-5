// Bhavy Bhuva
// 220130318038
/*Write a program in Java to develop Banking Application in which user deposits the amount Rs. 5000/- and then start withdrawing of Rs. 2000/-, Rs.1500/- and it throws exception “Not Sufficient Fund” when user withdraws Rs. 3500/- thereafter. */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited :: Rs. " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn :: Rs. " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class P2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);

        try {
            account.withdraw(2000);
            account.withdraw(1500);
            account.withdraw(3500); // This will throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance :: Rs. " + account.getBalance());
    }
}
