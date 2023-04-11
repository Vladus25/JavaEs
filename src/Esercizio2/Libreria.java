package Esercizio2;

import java.util.List;

public class Libreria {
    private List<Libro> libri;

    public Libreria(List<Libro> libri) {
        this.libri = libri;
    }

    public String trova(String autore) {
        return libri.stream()
                    .filter(l -> l.getAutore().equals(autore))
                    .findFirst()
                    .map(Libro::getTitolo)
                    .orElse("Nessun libro trovato"); // Ritorna messaggio se non trovato
    }

    public long trovaNumeroLibri(String autore) {
        return libri.stream()
                    .filter(l -> l.getAutore().equals(autore))
                    .count();
    }

    public long trovaNumeroLibri(String autore, double prezzo) {
        return libri.stream()
                    .filter(l -> l.getAutore().equals(autore) && l.getPrezzo() > prezzo)
                    .count();
    }
}