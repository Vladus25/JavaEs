package Esercizio4;

public class Articolo {
    private String titolo;
    private String categoria;
    private double prezzoUnitario;

    public Articolo(String titolo, String categoria, double prezzoUnitario) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.prezzoUnitario = prezzoUnitario;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrezzoUnitario() {
        return prezzoUnitario;
    }
}
