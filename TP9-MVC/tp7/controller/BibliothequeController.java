package controller;

import model.Bibliotheque;
import view.BibliothequeVue;

public class BibliothequeController {
	Bibliotheque model; 
	BibliothequeVue vue;
	public BibliothequeController(Bibliotheque model) {
		this.model = model;
	}


	public void emprunteLivre(int numLivre) {
		if (model.emprunte(numLivre)) {
			vue.affiche("Emprunt effectué");
		}
		else {
			vue.affiche("Emprunt non effectué");
		}
	}

	public void rendreLivre(int numLivre) {
		model.rendre(numLivre);
		vue.affiche("Le livre a bien été rendu");
	}


	public void addView(BibliothequeVue vue) {
		this.vue = vue;
		
	}

}
