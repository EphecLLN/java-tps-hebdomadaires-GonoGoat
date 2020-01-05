package th;

public class CarteBanquaire extends Thread {
    Compte compte;
    private volatile Thread currentThread = null;

    public CarteBanquaire(Compte compte) {
        this.compte = compte;
    }

        public void run(){
            int montant = 5;
            int i=0;
            currentThread = Thread.currentThread();
            try{
                while (!currentThread.isInterrupted() && i<10){
                    Thread.sleep(5);
                    if (!(compte.retrait(montant))) {
                        System.out.println("Fin du thread\n Argent retiré : " + i*montant);
                        cancel();
                    }
                    i++;
                }
            }
            catch (InterruptedException exception){}
        }
        public void cancel(){
            currentThread.interrupt();
        }
}
