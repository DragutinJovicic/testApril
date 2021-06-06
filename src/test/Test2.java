package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Drugi zadatak Napisati program koji racuna razliku izmedju visine najviseg i
		 * najnizeg igraca kosarkaskog tima kao i prosecnu visinu igraca. Korisnik na
		 * standardni ulaz unosi visinu svih pet igraca kosarkskog tima. Visina je
		 * izrazena u metrima. Po zavrsetku unosa ispisuje se prosecna visina clana
		 * ekipe, visina najviseg igraca, visina najnizeg igraca i razlika u visini ta
		 * dva igraca. Ukoliko korisnik unese nevalidnu vrednost kao visinu ispisati
		 * poruku o gresci i omoguciti mu da ponovi unos. Smatrati da ne postoji
		 * kosarkas visi od 2,5 metara.
		 * 
		 * Zadatke pisati u dve odvojene klase nazvane Zadatak1 i Zadatak2. Izrada testa
		 * traje 90 minuta. Paket u kome se pisu klase nazvati test. Folder na drajvu
		 * nazvati test1.
		 */

		int igrac = 1;
		double zbir = 0;
		double visina;
		double najvisi = 0;
		double najnizi = 0;
		double zbirivisina;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Unesite visinu " + igrac + " . Igraca");
			visina = sc.nextDouble();
			if (visina <= 2.5) {
				zbir = zbir + visina;
				zbirivisina = zbir;
				if(zbirivisina < zbir + visina && zbirivisina <= visina) {
					 najnizi = zbirivisina ;
				} 
				else if (zbirivisina > zbir  && zbirivisina > najnizi) {
					najvisi = zbirivisina + zbir;
				}
				igrac++;
			} else {
				System.out.println("Greska");
				i--;
			}

			
		}

		System.out.println("Prosecna visina je" + zbir / 5);
		System.out.println("Najvisi je " + najvisi);
		System.out.println("Najnizi je " + najnizi);
	}

}
