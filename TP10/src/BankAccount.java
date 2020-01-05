public class BankAccount {
private double solde;
    public BankAccount() {
        solde = 0;
    }

    public synchronized void deposit(double amount) {
        this.solde += amount;
    }
    public synchronized void withdraw(double amount) {
        this.solde -= amount;
    }
    public synchronized double getAmount() {
        return this.solde;
    }
}
