package test;
/**
 * @author <a href="mailto:gery.casiez@lifl.fr">Gery Casiez</a>
 * modified by vvds
 */

import controller.BibliothequeController;
import model.Bibliotheque;
import view.BibliothequeVue;
import view.BibliothequeVueConsole;
import view.BibliothequeVueGUI;

public class BibliothequeMVC {
	public BibliothequeMVC() {
		//Création du modèle
		Bibliotheque model = new Bibliotheque();
		//Création des contrôleurs : Un pour chaque vue
		//Chaque contrôleur doit avoir une référence vers le modèle pour pouvoir le commander
		
		BibliothequeController controllerConsole = new BibliothequeController(model);
		BibliothequeController controllerGUI = new BibliothequeController(model);
		
		//Création des vues.
		//Chaque vue doit connaître son contrôleur et avoir une référence vers le modèle pour pouvoir l'observer
		
		BibliothequeVueConsole console = new BibliothequeVueConsole(model, controllerConsole);
		BibliothequeVueGUI gui = new BibliothequeVueGUI(model, controllerGUI);
		
		//On donne la référence à la vue pour chaque contrôleur
		controllerConsole.addView(console);
		controllerGUI.addView(gui);
		
	}
	
	public static void main(String args[]) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new BibliothequeMVC();
			}
		});
	}
}
