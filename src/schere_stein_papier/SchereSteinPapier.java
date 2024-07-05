package schere_stein_papier;

import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		String[] rps = {"r", "p", "s"};
		String computerMove = rps[new Random().nextInt(rps.length)];
		
		
		String playerMove;

		while(true) {
				System.out.println("Was wählst du: Schere: s Stein: r Papier: p");
				playerMove = scanner.nextLine();
				if (playerMove.equals("r") ||playerMove.equals("p") || playerMove.equals("s")) {
					break;
				}
				System.out.println(playerMove + "das zählt net");
			}
			System.out.println("der Bot spielt: " + computerMove);
			
			if (playerMove.equals(computerMove)) {
				System.out.println("Unentschieden!");
			}
			else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
					System.out.println("Du hast Verloren");
					
				} else if  (computerMove.equals("p")){
						System.out.println("Du hast Gewonnen");
				}
			}
			else if (playerMove.equals("p")) {
				if (computerMove.equals("s")) {
					System.out.println("Du hast Verloren");
					
				} else if  (computerMove.equals("r")){
						System.out.println("Du hast Gewonnen");
			}
			}
			else if (playerMove.equals("s")) {
				if (computerMove.equals("r")) {
					System.out.println("Du hast Verloren");
					
				} else if  (computerMove.equals("p")){
						System.out.println("Du hast Gewonnen");
				}
			}
			
			System.out.println("Nochmal spielen? (j/n)");
			String playagain = scanner.nextLine();
			
			if (!playagain.equals("j")) {
				break;
			}
			
			scanner.close();
		}
	}
		
}
