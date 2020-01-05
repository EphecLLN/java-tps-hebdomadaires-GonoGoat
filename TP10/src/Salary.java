public class Salary extends Thread {

    BankAccount compte;

    public Salary(BankAccount compte) {
        this.compte = compte;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            compte.deposit(10);
        }
    }
}
