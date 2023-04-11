package Esercizio5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContoCorrente cc1 = new ContoCorrente("Mario Rossi", 1000);
        ContoCorrente cc2 = new ContoCorrente("Luigi Bianchi", 500);
        ContoCorrente cc3 = new ContoCorrente("Giovanni Verdi", 0);

        Banca banca = new Banca();
        banca.aggiungiConto(cc1);
        banca.aggiungiConto(cc2);
        banca.aggiungiConto(cc3);
        
        System.out.println("Saldo attuale di conto 1: " + cc1.leggiSaldo());
        cc1.deposita(500);
        System.out.println("Saldo dopo deposito di conto 1: " + cc1.leggiSaldo());
        
        System.out.println("Saldo attuale di conto 2: " + cc2.leggiSaldo());
        cc2.preleva(200);
        System.out.println("Saldo dopo prelievo di conto 2: " + cc2.leggiSaldo());


        List<ContoCorrente> contiInRosso = banca.visualizzaContiInRosso();
        if (contiInRosso.size()  > 0) {
            System.out.println("Conti correnti in rosso:");
            for (ContoCorrente contoCorrente : contiInRosso) {
                System.out.println(contoCorrente.getNominativo());
            }
        } else {
            System.out.println("Non ci sono conti correnti in rosso.");
        }
    }
}
