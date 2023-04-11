package Esercizio9;

public class Autista {
	private String codice;
    private Mezzo automezzo;

    public Autista(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }
    
    public void setCodice(String codice) {
        this.codice = codice;
    }

    public Mezzo getAutomezzo() {
        return automezzo;
    }

    public void setAutomezzo(Mezzo automezzo) {
        this.automezzo = automezzo;
    }
}
