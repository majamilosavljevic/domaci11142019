package domaci_11142019;

import java.util.Scanner;

public class Zadatak2_11142019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju).
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite ceo pozitivan broj:");

		int broj = scan.nextInt();
		int suma_parnih = 0;
		int proizvod_neparnih = 1;
		int i = 1;

		while (i <= broj) {

			if (i % 2 == 0)
				suma_parnih = suma_parnih + (i);
			if (i % 2 == 1 && broj != 0)
				proizvod_neparnih = proizvod_neparnih * (i);

			i = i + 1;
		}

		if (broj == 0) {
			proizvod_neparnih = 0;
			suma_parnih = 0;
		}

		System.out.println("Suma parnih brojeva od 0 do " + broj + " je " + suma_parnih);
		System.out.println("Proizvod neparnih brojeva od 0 do " + broj + " je " + proizvod_neparnih);

	}
}