package Esercizio7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumeriDiversi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numeri = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Inserisci un numero: ");
            int num = scanner.nextInt();
            numeri.add(num);
        }

        System.out.println("Numeri diversi: ");
        for (int num : numeri) {
            System.out.println(num);
        }
        scanner.close();
    }
}
