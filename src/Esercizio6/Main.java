package Esercizio6;

public class Main {
    public static void main(String[] args) {
        Studente s1 = new Studente(1, "Mario", "Rossi");
        Studente s2 = new Studente(2, "Luigi", "Verdi");
        Studente s3 = new Studente(3, "Paolo", "Neri");
        
        Corso c1 = new Corso("Programmazione", "Prof. Bianchi", 10, 2);
        System.out.println("Posti disponibili nel corso " + c1.getNome() + ": " + c1.getNumPostiDisponibili());
        c1.aggiungiStudente(s1);
        c1.aggiungiStudente(s2);
        c1.aggiungiStudente(s3); // non viene aggiunto, perché il corso ha solo 2 posti
        System.out.println("Posti disponibili nel corso " + c1.getNome() + ": " + c1.getNumPostiDisponibili());
        System.out.println("Elenco matricole studenti iscritti al corso " + c1.getNome() + ": " + c1.getMatricoleStudenti());
    }
}

