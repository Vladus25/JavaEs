package Esercizio6;

public class Studente {
    private int matricola;
    private String nome;
    private String cognome;
    
    public Studente(int matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}