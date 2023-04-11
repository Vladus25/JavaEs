package Esercizio5;

public class ContoCorrente {
    private String nominativo;
    private double saldo;

    public ContoCorrente(String nominativo, double saldo) {
        this.nominativo = nominativo;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        saldo += importo;
    }

    public boolean preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
            return true;
        } else {
            return false;
        }
    }

    public double leggiSaldo() {
        return saldo;
    }

    public String getNominativo() {
        return nominativo;
    }
}