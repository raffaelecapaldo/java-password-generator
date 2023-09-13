package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {

		System.out.println("!!Benvenuto nel generatore di password non sicure!!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Scrivi il tuo nome: ");
		String userName = scanner.nextLine();
		
		System.out.print("Scrivi il tuo cognome: ");
		String userSurname = scanner.nextLine();
		
		System.out.print("Scrivi il tuo colore preferito: ");
		String userPrefColor = scanner.nextLine();
		
		scanner.close();
		
		System.out.print("Inserisci il tuo giorno di nascita: ");
		int dayDOB = scanner.nextInt();
		
		System.out.print("Inserisci il tuo mese di nascita: ");
		int monthDOB = scanner.nextInt();

		System.out.print("Inserisci il tuo anno di nascita: ");
		int yearDOB = scanner.nextInt();
		
		String generatedPswd = userName + "-" + userSurname + "-" + userPrefColor + "-" + yearDOB; 
		System.out.print("La tua password NON sicura è: " + generatedPswd);



		
		
		
	}

}
