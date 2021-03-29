package projet;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private int nbADeviner;
	private int nbEssaie;
	private int nbJoueur;


	public Game() {
		nbEssaie = 0;
		nbADeviner = 1000 + (int) (Math.random()*((9999 - 1000) + 1)); 
	}

	
	public void Jeu1() {
		Scanner clavier = new Scanner(System.in);
		int jeu = 0;
		while(jeu == 0) {
			System.out.println("Trouvez un nombre en 0 et 9999 :");
			nbJoueur = clavier.nextInt();
			if(nbJoueur == nbADeviner) {

				jeu = 1; 
			}else{

				if(nbEssaie == 10) {
					System.out.println("Le nombre était " + nbADeviner);
					jeu = 1;
					break;
				}else {
					if(nbJoueur < nbADeviner) {
						System.out.println("C'est +");

					}else if(nbJoueur > nbADeviner ) {
						System.out.println("C'est -");
					}
					nbEssaie++;
					System.out.println("Il vous reste plus que " + (10 - nbEssaie) + " essaie(s)" );
				}

			}
		}


	}

	public void Jeu2() {
		Scanner clavier = new Scanner(System.in);
		int jeu = 0;
		nbJoueur = 1000 + (int) (Math.random()*((9999 - 1000) + 1)); 
		System.out.println("Donnez nous un nombre entre 0 et 9999 :");
		nbADeviner = clavier.nextInt();
		while(jeu == 0) {
			if(nbJoueur == nbADeviner) {

				jeu = 1; 
			}else{

				if(nbEssaie == 10) {
					System.out.println("Le nombre était " + nbADeviner);
					jeu = 1;
					break;
				}else {
					if(nbJoueur < nbADeviner) {
						System.out.println("C'est +");
						nbJoueur = (nbJoueur+1) + (int) (Math.random()*((9999 - (nbJoueur+1)) + 1)); 

					}else{
						System.out.println("C'est -");
						nbJoueur = 1000 + (int) (Math.random()*(((nbJoueur-1) - 1000) + 1)); 
					}
					nbEssaie++;
					System.out.println("Il vous reste plus que " + (10 - nbEssaie) + " essaie(s)" );
				}

			}
		}
	}
}



