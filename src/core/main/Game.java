package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
	static ArrayList<String> asciiTab = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir la largeur des lettres : ");
        int L = scanner.nextInt();
        
        System.out.println("Veuillez saisir la hauteur des lettres : ");
        int H = scanner.nextInt();
        
        System.out.println("Veuillez saisir une lettre de l'alphabet : ");
        String caractere = scanner.next().toUpperCase();

        while (caractere.length()>1)
        {
        	System.out.println("Veuillez saisir seulement une lettre de l'alphabet : ");
            caractere = scanner.next();
        }
        
        System.out.println("Veuillez saisir une chaine de caractère : ");
        String chaine = scanner.next().toUpperCase();
        
        for(int i = 0; i < H; i++) {
			asciiTab.add(scanner.nextLine());
		}
        
        buildCharacter(caractere, L, H);
        buildText(chaine, L, H);
        
        scanner.close();
	}
	
	public static void buildCharacter(String caractere, int width, int height)
	{
		
	}
	
	public static void buildText(String text, int width, int height)
	{	
		ArrayList<Integer> listIndex = new ArrayList<Integer>();
		for(char c : text.toCharArray()) {
			if(c < 'A' || c > 'Z') listIndex.add(26);
			else {
				for(char letter : alphabet.toCharArray()) {
					if(c == letter) {
						listIndex.add(alphabet.indexOf(letter));
					}
				}
			}
		}
		
		for(int i=0; i<height; i++){
			for(int j = 0; j < listIndex.size(); j++) {
				System.out.print(asciiTab.get(i).substring(listIndex.get(j)*width, listIndex.get(j)*width + width));
			}
		}
		
		System.out.println();
	}

}
