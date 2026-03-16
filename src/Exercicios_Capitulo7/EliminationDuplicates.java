package Exercicios_Capitulo7;

import java.util.Scanner;

public class EliminationDuplicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int numero = input.nextInt();

            boolean isDuplicated = false;

            for (int j = 0; j < i; j++) {

                if (numero == array[j]) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                array[i] = numero;
                System.out.println(numero);
            }
        }
    }
}
