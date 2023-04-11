package Esercizio1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Docente docente1 = new Docente("Mario", "Rossi", "001", 40);
        Docente docente2 = new Docente("Paola", "Bianchi", "002", 35);
        Docente docente3 = new Docente("Luca", "Verdi", "003", 50);

        ArrayList<Docente> docenti = new ArrayList<>();
        docenti.add(docente1);
        docenti.add(docente2);
        docenti.add(docente3);

        Universita universita = new Universita(docenti);

        System.out.println("Eta' minima dei docenti: " + universita.etaMinima());

        boolean trovato = universita.trovaDocente("Mario", "Rossi");
        if (trovato) {
            System.out.println("Il docente e stato trovato");
        } else {
            System.out.println("Il docente non e stato trovato");
        }
    }
}