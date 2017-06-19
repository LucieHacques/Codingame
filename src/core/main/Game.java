package main;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir la largeur des lettres : ");
        int L = scanner.nextInt();
        
        System.out.println("Veuillez saisir la hauteur des lettres : ");
        int H = scanner.nextInt();
        
        System.out.println("Veuillez saisir une lettre de l'alphabet");
        String caractere = scanner.next();
        
        while (caractere.length()>1)
        {
        	System.out.println("Veuillez saisir seulement une lettre de l'alphabet");
            caractere = scanner.next();
        }
        
        System.out.println("Veuillez saisir une chaine de caractère : ");
        String chaine = scanner.next();
        
        showResultCharacter(caractere);
        
	}
	
	public static void showResultCharacter(String caractere)
	{
		
	}

}
