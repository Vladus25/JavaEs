package Esercizio8;

import java.util.*;

public class RubricaTelefonica {
    private HashMap<String, Persona> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void inserisciContatto(Persona p) {
        contatti.put(p.getTelefono(), p);
    }

    public void cancellaContatto(String telefono) {
        contatti.remove(telefono);
    }

    public Persona cercaContattoPerTelefono(String telefono) {
        return contatti.get(telefono);
    }

    public String cercaTelefonoPerNomeCognome(String nome, String cognome) {
        for (Persona p : contatti.values()) {
            if (p.getNome().equals(nome) && p.getCognome().equals(cognome)) {
                return p.getTelefono();
            }
        }
        return null;
    }

    public void stampaRubricaOrdinata() {
        List<Persona> listaContatti = new ArrayList<>(contatti.values());
        Collections.sort(listaContatti, Comparator.comparing(Persona::getNome).thenComparing(Persona::getCognome));
        for (Persona p : listaContatti) {
            System.out.println(p);
        }
    }
}

