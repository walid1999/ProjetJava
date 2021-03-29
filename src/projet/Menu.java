package projet;

import java.util.Random;
import java.util.Scanner;


public class Menu {
	
	public static void main(String[] args) {
		
		Game jeux = new Game();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Jeu ( 1 ou 2)");
		
		int choix = in.nextInt();
		
		if(choix==1) {
			jeux.Jeu1();
		}else if(choix ==2) {
			jeux.Jeu2();
		}
		
	}

}
