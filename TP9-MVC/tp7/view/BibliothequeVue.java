package view;

import java.util.Observer;

import controller.BibliothequeController;
import model.Bibliotheque;
@Deprecated
public abstract class BibliothequeVue implements Observer{
	
	protected Bibliotheque model;
	protected BibliothequeController controller;
	
	BibliothequeVue(Bibliotheque model,
			BibliothequeController controller) {
		this.model = model;
		this.controller = controller;
		this.model.addObserver(this);
	}

	public abstract void affiche(String string) ;
}
