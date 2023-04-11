package Esercizio3;

public class Main {

	public static void main(String[] args) {
        Ingrediente pomodoro = new Ingrediente("Pomodoro", 20);
        Ingrediente mozzarella = new Ingrediente("Mozzarella", 300);
        Ingrediente basilico = new Ingrediente("Basilico", 5);

        Pizza margherita = new Pizza("Margherita", 5.5);
        margherita.aggiungiIngrediente(pomodoro);
        margherita.aggiungiIngrediente(mozzarella);
        margherita.aggiungiIngrediente(basilico);

        System.out.println("La pizza " + margherita.getNome() + " ha " + margherita.kilocalorie() + " kcal.");
    }

}
