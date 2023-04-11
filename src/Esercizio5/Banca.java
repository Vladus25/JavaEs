package Esercizio5;

import java.util.ArrayList;

public class Banca {
    private ArrayList<ContoCorrente> contiCorrenti;

    public Banca() {
        contiCorrenti = new ArrayList<>();
    }

    public void aggiungiConto(ContoCorrente conto) {
        contiCorrenti.add(conto);
    }

    public ArrayList<ContoCorrente> visualizzaContiInRosso() {
        ArrayList<ContoCorrente> contiInRosso = new ArrayList<>();
        for (ContoCorrente conto : contiCorrenti) {
            if (conto.leggiSaldo() == 0) {
                contiInRosso.add(conto);
            }
        }
        return contiInRosso;
    }
}