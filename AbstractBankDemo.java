abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " +amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private final double MIN_BALANCE = 500.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Savings Withdrawal: " +amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Failed: Insufficient funds (Must maintain min balance of " + MIN_BALANCE + ").");
        }
    }
}

class CurrentAccount extends BankAccount {
    private final double OVERDRAFT_LIMIT = -1000.0;

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Current Withdrawal: " +amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Failed: Overdraft limit exceeded (Limit: " + OVERDRAFT_LIMIT + ").");
        }
    }
}
public class AbstractBankDemo {
    public static void main(String[] args) {
        System.out.println("----- Testing Saving Account -----");
        BankAccount savings = new SavingsAccount(1000.0);
        savings.deposit(500.0);
        savings.withdraw(200.0);
        savings.withdraw(900.0); // Should fail

        System.out.println("\n----- Testing Current Account -----");
        BankAccount current = new CurrentAccount(500.0);
        current.deposit(300.0);
        current.withdraw(600.0);
        current.withdraw(1300.0); // Should fail
    }
}
