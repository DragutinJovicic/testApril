package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * Test Java Prvi zadatak Napisati program na programskom jeziku Java koji sluzi
		 * kao kviz za pogadjanje zemalja iz kojih dolaze teniseri. Korisnik moze da
		 * odgovara sve dok ne izabere opciju za izlaz. Korisniku se na standardni izlaz
		 * ispisuje sledecui meni: 1. Djokovic 2. Nadal 3. Federer 4. Izlaz
		 * 
		 * Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. Nakon
		 * toga mu se ispisuje poruka sa pitanjem. Npr. ukoliko je korisnik izablao
		 * opciju jedan ispisuje se poruka: "Iz koje zemlje dolazi Djokovic?". Ukoliko
		 * korisnik unese tacan odgovor ispisuje se poruka "Tacno!". Ukoliko korisnik
		 * unese netacan odgovor ispisuje se poruka "Netacno!". Nakon toga opet se
		 * ispisuje isti meni sa istim funkcionalnostima. Ukoliko korisnik izabere
		 * opciju 4 izlazi se iz programa. Ukoliko korisnik unese neki nevalidan broj
		 * kao opciju ponovo ispisati meni. Prilikom provere tacnosti odgovora ne treba
		 * voditi racuna o velikim i malim slovima. Tacni odgovori su: Djokovic -
		 * Srbija, Nadal - Spanija, Federer - Svajcarska.
		 */

		boolean tacno = false;
		do {

			System.out.println("Odaberite opciju: ");
			System.out.println();
			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");

			
			Scanner sc = new Scanner(System.in);
			int izbor = sc.nextInt();

			Scanner txt = new Scanner(System.in);
			String djokovic = "SRBIJA";
			String nadal = "SPANIJA";
			String federer = "SVAJCARSKA";

			switch (izbor) {

			case 1:
				
				System.out.println("Iz koje zemlje dolazi Djokovic?");
				String unosDjokovic;
				unosDjokovic = txt.nextLine();
				unosDjokovic = unosDjokovic.toUpperCase();
				tacno = unosDjokovic.equals(djokovic);
				if (tacno) {
					System.out.println("Tacno!");
				} else {
					System.out.println("Netacno!");
				}
				
				break;

			case 2:
				System.out.println("Iz koje zemlje dolazi Nadal?");
				String unosNadal;
				unosNadal = txt.nextLine();
				unosNadal = unosNadal.toUpperCase();
				tacno = unosNadal.equals(nadal);
				if (tacno) {
					System.out.println("Tacno!");
				} else {
					System.out.println("Netacno!");
				}
				break;

			case 3:
				System.out.println("Iz koje zemlje dolazi Federer?");
				String unosFederer;
				unosFederer = txt.nextLine();
				unosFederer = unosFederer.toUpperCase();
				tacno = unosFederer.equals(federer);
				if (tacno) {
					System.out.println("Tacno!");
				} else {
					System.out.println("Netacno!");
				}
				break;

			case 4:
				tacno = true;
				break;

			default:
				System.out.println("Pogresna opcija!");
				tacno = false;
				break;

			}

		} while(!tacno);

	}

}
