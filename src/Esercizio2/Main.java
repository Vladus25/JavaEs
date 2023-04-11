package Esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        Libro libro1 = new Libro("Il nome della rosa", "Umberto Eco", 10.99);
        Libro libro2 = new Libro("La solitudine dei numeri primi", "Paolo Giordano", 8.99);
        Libro libro3 = new Libro("La divina commedia", "Dante Alighieri", 5.99);
        Libro libro4 = new Libro("Il cavaliere inesistente", "Italo Calvino", 9.99);
        Libro libro5 = new Libro("Uno nessuno centomila", "Luigi Pirandello", 12.99);

        List<Libro> libri = new ArrayList<>();
        libri.add(libro1);
        libri.add(libro2);
        libri.add(libro3);
        libri.add(libro4);
        libri.add(libro5);

        Libreria libreria = new Libreria(libri);

        String titolo = libreria.trova("Umberto Eco");
        System.out.println("Il titolo del libro di Umberto Eco e': " + titolo);

        long numLibri = libreria.trovaNumeroLibri("Umberto Eco");
        System.out.println("Il numero di libri di Umberto Eco e': " + numLibri);

        long numLibriCostosi = libreria.trovaNumeroLibri("Umberto Eco", 10.0);
        System.out.println("Il numero di libri di Umberto Eco con prezzo maggiore di 10.0 e': " + numLibriCostosi);
    }
}
