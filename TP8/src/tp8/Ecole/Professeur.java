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
        if (super.getAge() < 23) {
            return diff - (23 - super.getAge());
        }
        return diff;
    }
}
