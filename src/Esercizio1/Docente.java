package Esercizio1;

public class Docente {
    private String nome;
    private String cognome;
    private String codice;
    private int eta;

    public Docente(String nome, String cognome, String codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }

    public String getCodice() {
        return codice;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }
}
