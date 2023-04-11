package Esercizio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RubricaTelefonica rubrica = new RubricaTelefonica();

        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Elimina contatto");
            System.out.println("3. Cerca contatto per numero di telefono");
            System.out.println("4. Cerca numero di telefono per nome e cognome");
            System.out.println("5. Visualizza tutti i contatti");
            System.out.println("0. Esci");

            scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci nome:");
                    String nome = input.nextLine();

                    System.out.println("Inserisci cognome:");
                    String cognome = input.nextLine();

                    System.out.println("Inserisci telefono:");
                    String telefono = input.nextLine();

                    System.out.println("Inserisci email:");
                    String email = input.nextLine();

                    Persona persona = new Persona(nome, cognome, telefono, email);
                    rubrica.inserisciContatto(persona);
                    break;

                case 2:
                    System.out.println("Inserisci il numero di telefono del contatto da eliminare:");
                    String numEliminare = input.nextLine();
                    rubrica.cancellaContatto(numEliminare);
                    break;

                case 3:
                    System.out.println("Inserisci il numero di telefono del contatto da cercare:");
                    String numCercare = input.nextLine();
                    Persona personaCercata = rubrica.cercaContattoPerTelefono(numCercare);

                    if (personaCercata != null) {
                        System.out.println("Contatto trovato:");
                        System.out.println(personaCercata);
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 4:
                    System.out.println("Inserisci il nome del contatto da cercare:");
                    String nomeCercare = input.nextLine();

                    System.out.println("Inserisci il cognome del contatto da cercare:");
                    String cognomeCercare = input.nextLine();

                    String numTelefono = rubrica.cercaTelefonoPerNomeCognome(nomeCercare, cognomeCercare);

                    if (numTelefono != null) {
                        System.out.println("Numero di telefono trovato: " + numTelefono);
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 5:
                    System.out.println("Contatti in rubrica:");
                    rubrica.stampaRubricaOrdinata();
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

            System.out.println();
        }

        input.close();
    }
}

