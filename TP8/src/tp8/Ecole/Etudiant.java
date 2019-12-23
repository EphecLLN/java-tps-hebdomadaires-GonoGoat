package tp8.Ecole;

import java.time.LocalDate;
import java.time.Period;

public class Etudiant extends Personne {
    private String matricule;

    public LocalDate checkYear(LocalDate localDate) throws YearException {
        if (localDate.getYear() < 2000 || localDate.getYear() > LocalDate.now().getYear()) {
            throw new YearException("Année invalide");
        }
        return localDate;
    }

    public Etudiant(String nom, String prenom, LocalDate dateNaissance, LocalDate dateArrivee) throws YearException {
        super(nom, prenom, dateNaissance, dateArrivee);
    }

    public int anciennete() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(getArrivee(),now);
        int diff = period.getYears();
        return diff;
    }

    public String matricule() {
        int year = getArrivee().getYear();
        matricule = new String(year + "" + super.getNom().charAt(0) + super.getPrenom().charAt(0));
        return matricule;
    }

    @Override
    public String toString() {
        return super.toString() + "Matricule : " + matricule() + "\n";
    }

    @Override
    public void affiche() {
        System.out.println(this);
    }


}
