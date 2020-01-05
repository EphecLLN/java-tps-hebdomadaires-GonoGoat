public class BankCard extends Thread {
    BankAccount compte;

    public BankCard(BankAccount compte) {
        this.compte = compte;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            compte.withdraw(100);
        }
    }
}
