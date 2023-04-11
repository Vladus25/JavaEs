package Esercizio4;

import java.util.ArrayList;

public class Carrello {
    private ArrayList<Articolo> listaArticoli;

    public Carrello() {
        listaArticoli = new ArrayList<>();
    }

    public void aggiungiArticolo(Articolo articolo) {
        listaArticoli.add(articolo);
    }

    public void stampaArticoli() {
        for (Articolo a : listaArticoli) {
            System.out.println("Titolo: " + a.getTitolo() +
                    " - Categoria: " + a.getCategoria() +
                    " - Prezzo unitario: " + a.getPrezzoUnitario());
        }
    }

    public double totale() {
        double totale = 0;
        for (Articolo a : listaArticoli) {
            totale += a.getPrezzoUnitario();
        }
        return totale;
    }
}