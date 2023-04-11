package Esercizio9;

public class Mezzo {
    private String targa;
    private Autista autista;

    public Mezzo(String targa) {
        this.targa = targa;
    }

    public String getTarga() {
        return targa;
    }

    public Autista getAutista() {
        return autista;
    }

    public void setAutista(Autista autista) {
        this.autista = autista;
    }
}