package Esercizio9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    Trasporti trasporti = new Trasporti();
	    
	    // Aggiungi 3 mezzi
	    trasporti.aggiungiMezzo("AA111AA");
	    trasporti.aggiungiMezzo("BB222BB");
	    trasporti.aggiungiMezzo("CC333CC");

	    // Aggiungi 3 autisti
	    trasporti.aggiungiAutista("001");
	    trasporti.aggiungiAutista("002");
	    trasporti.aggiungiAutista("003");

	    boolean continua = true;
	    while (continua) {
	        System.out.println("1 - Aggiungi mezzo");
	        System.out.println("2 - Aggiungi autista");
	        System.out.println("3 - Rimuovi mezzo");
	        System.out.println("4 - Rimuovi autista");
	        System.out.println("5 - Assegna mezzo ad autista");
	        System.out.println("6 - Libera mezzo da autista");
	        System.out.println("7 - Scambia due mezzi");
	        System.out.println("8 - Stampa statistica");
	        System.out.println("0 - Esci");

	        int scelta = input.nextInt();
	        input.nextLine();

	        switch (scelta) {
	            case 1:
	                System.out.print("Inserisci la targa del mezzo: ");
	                String targaMezzo = input.nextLine();
	                trasporti.aggiungiMezzo(targaMezzo);
	                System.out.println("Mezzo aggiunto.");
	                break;
	            case 2:
	                System.out.print("Inserisci il codice dell'autista: ");
	                String codiceAutista = input.nextLine();
	                trasporti.aggiungiAutista(codiceAutista);
	                System.out.println("Autista aggiunto.");
	                break;
	            case 3:
	                System.out.print("Inserisci la targa del mezzo da rimuovere: ");
	                String targaDaRimuovere = input.nextLine();
	                trasporti.rimuoviMezzo(targaDaRimuovere);
	                System.out.println("Mezzo rimosso.");
	                break;
	            case 4:
	                System.out.print("Inserisci il codice dell'autista da rimuovere: ");
	                String codiceDaRimuovere = input.nextLine();
	                trasporti.rimuoviAutista(codiceDaRimuovere);
	                System.out.println("Autista rimosso.");
	                break;
	            case 5:
	                System.out.print("Inserisci il codice dell'autista: ");
	                String codiceAssegnazione = input.nextLine();
	                System.out.print("Inserisci la targa del mezzo: ");
	                String targaAssegnazione = input.nextLine();
	                trasporti.impegnaMezzo(codiceAssegnazione, targaAssegnazione);
	                System.out.println("Mezzo assegnato.");
	                break;
	            case 6:
	                System.out.print("Inserisci la targa del mezzo: ");
	                String targaLibero = input.nextLine();
	                trasporti.liberaMezzo(targaLibero);
	                System.out.println("Mezzo liberato.");
	                break;
	            case 7:
	                System.out.print("Inserisci la targa del primo mezzo: ");
	                String primaTarga = input.nextLine();
	                System.out.print("Inserisci la targa del secondo mezzo: ");
	                String secondaTarga = input.nextLine();
	                trasporti.scambio(primaTarga, secondaTarga);
	                System.out.println("Mezzi scambiati.");
	                break;
	            case 8:
	                int statistiche = trasporti.statistica();
	                break;
	            case 0:
	                continua = false;
	                break;
	            default:
	                System.out.println("Scelta non valida.");
	        }
	    }
	}
}


