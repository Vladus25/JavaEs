package Esercizio4;

public class Main {

	public static void main(String[] args) {
        Articolo a1 = new Articolo("Libro 1", "Libri", 12.99);
        Articolo a2 = new Articolo("T-shirt 1", "Abbigliamento", 19.99);
        Articolo a3 = new Articolo("Scarpe 1", "Scarpe", 49.99);

        Carrello c = new Carrello();
        c.aggiungiArticolo(a1);
        c.aggiungiArticolo(a2);
        c.aggiungiArticolo(a3);

        c.stampaArticoli();
        System.out.println("Totale: " + c.totale());
    }

}
