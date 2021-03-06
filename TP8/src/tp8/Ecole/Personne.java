package tp8.Ecole;

import tp8.Affichable;

import java.time.*;

abstract public class Personne implements Affichable {
    private String nom = "";
    private String prenom = "";
    private LocalDate dateNaissance;
    private LocalDate dateArrivee;

    public Personne(String nom, String prenom, LocalDate dateNaissance, LocalDate dateArrivee) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateArrivee = dateArrivee;
    }

    public abstract int anciennete();

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = Period.between(dateNaissance,now);
        int diff = period.getYears();
        return diff;
    }

    public String toString() {
        return new String("Nom : " + nom + "\n" +
                "Prenom : " + prenom + "\n" +
                "Age : " + getAge() + " ans\n" +
                "Ancienneté : " + anciennete() + " années\n");
    }

    public LocalDate getArrivee() {
        return dateArrivee;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    @Override
    public void affiche() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        try {
            Etudiant etu = new Etudiant("Gauthier", "Verschraegen", LocalDate.of(2000, 9, 14), LocalDate.of(2017, 9, 16));
            etu.affiche();
        }
        catch (YearException e) {
            System.out.println(e);
        }
        Professeur prof = new Professeur("Toto","Tata",LocalDate.of(1985,5,13),LocalDate.of(2003,5,23));
        prof.affiche();
    }
}
