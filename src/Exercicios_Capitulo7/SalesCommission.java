package Exercicios_Capitulo7;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        int[] array = new int[9];

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da venda bruta: ");
        int grossSales = input.nextInt();

        while (grossSales != -1) {

            double totalSalary = 200 + 0.09 * grossSales;
            int valor = (int) (totalSalary / 100) - 2;

            if (valor >= 8){
                array[8]++;
            }else
                array[valor]++;

            System.out.print("Digite o valor da venda bruta: ");
            grossSales = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            if (i == 8)
                System.out.printf("$1000+: %d%n", array[i]);
            else
                System.out.printf("$%d - $%d: %d%n", i * 100 + 200, i * 100 + 200 + 99, array[i]);
        }
    }
}
