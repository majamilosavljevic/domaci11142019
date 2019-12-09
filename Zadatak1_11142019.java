package domaci_11142019;

import java.util.Scanner;

public class Zadatak1_11142019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj
		 * mesec ima dana. (Vodite racuna o prestupnoj godini!) - za resavanje ovog
		 * zadatka koristiti switch
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite prvo godinu pa zatim redni broj zeljenog meseca da proverite koliko ima dana: ");
		int godina = scan.nextInt();
		int mesec = scan.nextInt();

		switch (mesec) {
		case 1:
			System.out.println("Januar ima 31 dan.");
			break;
		case 2:
			if (godina % 400 == 0) {
				System.out.println("Februar ima 29 dana.");
			} else if ((godina % 100 != 0) && (godina % 4 == 0)) {
				System.out.println("Februar ima 29 dana.");
			} else {
				System.out.println("Februar ima 28 dana.");
			}
			break;
		case 3:
			System.out.println("Mart ima 31 dan.");
			break;
		case 4:
			System.out.println("April ima 31 dan.");
			break;
		case 5:
			System.out.println("Maj ima 31 dan.");
			break;
		case 6:
			System.out.println("Jun ima 31 dan.");
			break;
		case 7:
			System.out.println("Jul ima 31 dan.");
			break;
		case 8:
			System.out.println("Avgust ima 31 dan.");
			break;
		case 9:
			System.out.println("Septembar ima 31 dan.");
			break;
		case 10:
			System.out.println("Oktobar ima 31 dan.");
			break;
		case 11:
			System.out.println("Novembar ima 31 dan.");
			break;
		case 12:
			System.out.println("Decembar ima 31 dan.");
			break;
		default:
			System.out.println("Niste uneli odgovarajucu opciju.");

		}

	}

}
