package Esercizio3;

public class Ingrediente {
	private String nome;
    private int kcal;

    public Ingrediente(String nome, int kcal) {
        this.nome = nome;
        this.kcal = kcal;
    }

    public String getNome() {
        return nome;
    }

    public int getKcal() {
        return kcal;
    }
}
