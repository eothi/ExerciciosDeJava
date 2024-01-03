package Arrays;

import java.util.Scanner;

public class Array13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("digite 10 valores na tabela:");

        for (int i = 0; i < a.length; i++) {
            System.out.println("digite o valor da posicao: " + (i + 1));
            a[i] = input.nextInt();

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 5 == 0) {
                System.out.println("valores da posicao " + (i + 1) + " que sao multiplos de 5 sao: " + a[i]);
            }
        }
    }
}
