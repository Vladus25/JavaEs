package Esercizio3;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private String nome;
    private double prezzo;
    private List<Ingrediente> ingredienti;

    public Pizza(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.ingredienti = new ArrayList<>();
    }

    public void aggiungiIngrediente(Ingrediente ingrediente) {
        this.ingredienti.add(ingrediente);
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int kilocalorie() {
        return ingredienti.stream().mapToInt(Ingrediente::getKcal).sum();
    }
}
