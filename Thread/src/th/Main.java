package th;

public class Main {
    public static void main (String[] args) {
        Thread main = Thread.currentThread();
        Compte compte = new Compte();
        CarteBanquaire bank = new CarteBanquaire(compte);

        for (int i=0;i<10;i++) {
            bank = new CarteBanquaire(compte);
            bank.start();
        }

        try
        {
            bank.join();
            System.out.println(compte.getSolde());
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
