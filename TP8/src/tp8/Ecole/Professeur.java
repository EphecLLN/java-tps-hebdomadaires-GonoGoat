package tp8.Ecole;

import java.time.LocalDate;
import java.time.Period;

public class Professeur extends Personne {
    public Professeur(String nom, String prenom, LocalDate dateNaissance, LocalDate dateArrivee) {
        super(nom, prenom, dateNaissance, dateArrivee);
    }

    @Override
    public int anciennete() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(getArrivee(),now);
        int diff = period.getYears();
        if ((this.getArrivee().getYear() - this.getDateNaissance().getYear()) < 23) { // Si j'ia moins de 23 ans quand je suis arrivé
            return diff - (this.getDateNaissance().getYear() + 23 -this.getArrivee().getYear());
        }
        return diff;
    }

    @Override
    public void affiche() {
        System.out.println(this);
    }
}
