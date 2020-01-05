package th;

public class Compte {
    private int solde;
    public Compte() {
        solde = 700;
    }

    synchronized public boolean retrait(int montant) {
        if (montant <= solde) {
            solde -= montant;
            return true;
        }
        System.out.println("Solde insuffisant pour ce montant");
        return false;
    }

    public int getSolde() {
        return solde;
    }
}
