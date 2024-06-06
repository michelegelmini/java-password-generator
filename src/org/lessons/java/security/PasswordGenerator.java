package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome:");
		String firstName = input.nextLine();

		System.out.println("Inserisci il tuo cognome:");
		String lastName = input.nextLine();

		System.out.println("Inserisci il tuo colore preferito:");
		String favouriteColor = input.nextLine();

		System.out.println("Inserisci il giorno (numero) in cui sei nato:");
		int dayOfBirth = input.nextInt();

		System.out.println("Inserisci il mese (numero) in cui sei nato:");
		int monthOfBirth = input.nextInt();

		System.out.println("Inserisci il anno di nascita:");
		int yearOfBirth = input.nextInt();
		

		System.out.println("La tua password è: "+firstName+"-"+lastName+"-"+favouriteColor+"-"+dayOfBirth+"-"+monthOfBirth+"-"+yearOfBirth);
		
		
		

	}

}
