package Esercizio9;

import java.util.ArrayList;
import java.util.List;

public class Trasporti {
    private List<Autista> autisti;
    private List<Mezzo> mezzi;

    public Trasporti() {
        this.autisti = new ArrayList<>();
        this.mezzi = new ArrayList<>();
    }

    public void aggiungiMezzo(String unaTarga) {
        mezzi.add(new Mezzo(unaTarga));
    }

    public void aggiungiAutista(String unCodice) {
        autisti.add(new Autista(unCodice));
    }

    public void rimuoviMezzo(String unaTarga) {
        mezzi.removeIf(m -> m.getTarga().equals(unaTarga));
        autisti.forEach(a -> {
            if (a.getAutomezzo() != null && a.getAutomezzo().getTarga().equals(unaTarga)) {
                a.setAutomezzo(null);
            }
        });
    }

    public void rimuoviAutista(String unCodice) {
        autisti.removeIf(a -> a.getCodice().equals(unCodice));
    }
    
    public void impegnaMezzo(String codiceAutista, String targaMezzo) {
        // Cerca l'autista con il codice specificato
        Autista autista = null;
        for (Autista a : autisti) {
            if (a.getCodice().equals(codiceAutista)) {
                autista = a;
                break;
            }
        }

        // Cerca il mezzo con la targa specificata
        Mezzo mezzo = null;
        for (Mezzo m : mezzi) {
            if (m.getTarga().equals(targaMezzo)) {
                mezzo = m;
                break;
            }
        }

        // Verifica che l'autista e il mezzo non siano già assegnati
        if (autista.getAutomezzo() == null && mezzo.getAutista() == null) {
            autista.setAutomezzo(mezzo);
            mezzo.setAutista(autista);
            System.out.println("Mezzo " + targaMezzo + " assegnato all'autista " + codiceAutista);
        } else {
            System.out.println("Impossibile assegnare il mezzo all'autista.");
        }
    }


    public void liberaMezzo(String unaTarga) {
        autisti.stream().filter(a -> a.getAutomezzo() != null && a.getAutomezzo().getTarga().equals(unaTarga)).forEach(a -> a.setAutomezzo(null));
    }

    public void scambio(String primaTarga, String secondaTarga) {
        Mezzo mezzo1 = mezzi.stream().filter(m -> m.getTarga().equals(primaTarga)).findFirst().orElse(null);
        Mezzo mezzo2 = mezzi.stream().filter(m -> m.getTarga().equals(secondaTarga)).findFirst().orElse(null);
        if (mezzo1 != null && mezzo2 != null) {
            int index1 = mezzi.indexOf(mezzo1);
            int index2 = mezzi.indexOf(mezzo2);
            mezzi.set(index1, mezzo2);
            mezzi.set(index2, mezzo1);
        }
    }

    public int statistica() {
        System.out.println("Elenco mezzi e autisti assegnati:");
        for (Mezzo m : mezzi) {
            System.out.print("Targa: " + m.getTarga());
            if (m.getAutista() != null) {
                System.out.println(", Autista: " + m.getAutista().getCodice());
            } else {
                System.out.println(", Nessun autista assegnato.");
            }
        }
        int numeroMezzi = mezzi.size();
        System.out.println("Numero mezzi: " + numeroMezzi);
        return numeroMezzi;
    }

}

