package Esercizio6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Corso {
    private String nome;
    private String docente;
    private int crediti;
    private List<Studente> studenti;
    private int maxStudenti;

    public Corso(String nome, String docente, int crediti, int maxStudenti) {
        this.nome = nome;
        this.docente = docente;
        this.crediti = crediti;
        this.maxStudenti = maxStudenti;
        this.studenti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDocente() {
        return docente;
    }

    public int getCrediti() {
        return crediti;
    }

    public int getNumPostiDisponibili() {
        return maxStudenti - studenti.size();
    }

    public boolean aggiungiStudente(Studente s) {
        if (studenti.size() < maxStudenti) {
            studenti.add(s);
            System.out.println("Studente aggiunto.");
            return true;
        }
        System.out.println("Non si puo aggiungere, il corso e pieno.");
        return false;
    }

    public List<Integer> getMatricoleStudenti() {
        return studenti.stream().map(Studente::getMatricola).collect(Collectors.toList());
    }
}
