import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import com.github.javafaker.Faker;

import main.Game;

public class GameTest {

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testbuildCharacter() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		
		Boolean isOk = false;
		
		Game game = new Game();
		
		Faker faker = new Faker();
		
        int L = 4;
        int H = 5;

        int index = faker.number().numberBetween(0, 10);
        String caractere = faker.lorem().characters(index).toUpperCase();
        if (caractere.toUpperCase().contains(alphabet)){
        	isOk=true;
        }
		
		assertTrue(isOk);
	}
	
	@Test
	public void testbuildText() {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
		
		Boolean isOk = true;
		
		Game game = new Game();
		
		Faker faker = new Faker();
		
        int L = 4;
        int H = 5;

        String chaine = faker.lorem().toString().toUpperCase();
        int index = faker.number().numberBetween(0, 10);
        String caractere = faker.lorem().characters(index).toUpperCase();
        for (char c:chaine.toCharArray()){
        	if (!caractere.toUpperCase().contains(alphabet)){
            	isOk=false;
            }
        }
        
		
		assertTrue(isOk);
	}
}
