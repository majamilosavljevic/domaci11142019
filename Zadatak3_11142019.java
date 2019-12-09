package domaci_11142019;

import java.util.Scanner;

public class Zadatak3_11142019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
		 * unese 1 2 5 3 -1, program treba da ispise 11
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int start = 0;
		int broj = 0;
		int nula = 0;
		System.out.println("Unesite ceo pozitivan broj da pokrenete program:");
		System.out.println("(za izlaz iz programa i prikaz rezultata unesite ceo negativan broj)");
		broj = scan.nextInt();
		while (broj >= 0) {
			System.out.println("Molimo unesite sledeci broj:");
			broj = scan.nextInt();
			if (broj >= 0) {
				start += broj;
			} else {
				start += nula;
			}
		}

		System.out.println("Zbir unetih pozitivnih brojeva je " + start + ".");
	}

}
