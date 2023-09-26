package work04;

public class BankAccount {

    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return this.balance += amount;

    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }
    
    public void transfer(double amount, BankAccount account) {
        this.withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + owner.getId() + ", number=" + number + ", owner=" + owner + ", balance=" + balance + '}';
    }

}
