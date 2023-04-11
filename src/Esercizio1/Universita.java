package Esercizio1;

import java.util.ArrayList;

public class Universita {
	private ArrayList<Docente> docenti;

    public Universita(ArrayList<Docente> docenti) {
        this.docenti = docenti;
    }

    public int etaMinima() {
        return docenti.stream()
                      .mapToInt(Docente::getEta)
                      .min()
                      .orElse(-1); // Ritorna -1 se non ci sono docenti
    }

    public boolean trovaDocente(String nome, String cognome) {
        return docenti.stream()
                      .anyMatch(d -> d.getNome().equals(nome) && d.getCognome().equals(cognome));
    }
}
